package jmdb.tutorial.dropwizard.app;

import com.google.common.cache.CacheBuilderSpec;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.bundles.AssetsBundle;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;
import ixcode.platform.jersey.PojoFormProvider;
import jmdb.tutorial.dropwizard.app.applicationform.ApplicationFormResource;
import jmdb.tutorial.dropwizard.app.healthcheck.TemplateHealthCheck;
import jmdb.tutorial.dropwizard.app.helloworld.HelloWorldResource;
import jmdb.tutorial.dropwizard.app.person.PersonResource;
import jmdb.tutorial.dropwizard.domain.person.PersonDao;

import static ixcode.platform.dropwizard.EnvironmentBuilder.configure;

public class HelloWorldApp extends Service<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldApp().run(args);
    }

    private HelloWorldApp() {
        super("hello-world");

        addBundle(new ViewBundle());

        CacheBuilderSpec cacheSpec = AssetsBundle.DEFAULT_CACHE_SPEC;
        addBundle(new AssetsBundle("/assets/", cacheSpec, "/"));
    }

    @Override
    protected void initialize(HelloWorldConfiguration configuration,
                              Environment environment) {

        final String template = configuration.getTemplate();
        final String defaultName = configuration.getDefaultName();

        configure(environment)
                .withProviders(new PojoFormProvider())
                .withHealthChecks(new TemplateHealthCheck(template))
                .withResources(new ApplicationFormResource(),
                               new HelloWorldResource(template, defaultName),
                               new PersonResource(new PersonDao()));


    }

}