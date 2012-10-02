package ixcode.platform.dropwizard;

import com.yammer.dropwizard.config.Environment;
import com.yammer.metrics.core.HealthCheck;
import jmdb.tutorial.dropwizard.app.applicationform.ApplicationFormResource;
import jmdb.tutorial.dropwizard.app.helloworld.HelloWorldResource;
import jmdb.tutorial.dropwizard.app.person.PersonResource;

public class EnvironmentBuilder {

    private final Environment environment;

    public static EnvironmentBuilder configure(Environment environment) {
        return new EnvironmentBuilder(environment);
    }

    private EnvironmentBuilder(Environment environment) {
        this.environment = environment;
    }


    public EnvironmentBuilder withProviders(Object... providers) {
        for (Object provider : providers) {
            environment.addProvider(provider);
        }
        return this;
    }

    public EnvironmentBuilder withHealthChecks(HealthCheck... healthChecks) {
        for (HealthCheck healthCheck : healthChecks) {
            environment.addHealthCheck(healthCheck);
        }
        return this;
    }

    public EnvironmentBuilder withResources(Object... resources) {
        for (Object resource : resources) {
            environment.addResource(resource);
        }
        return this;
    }
}