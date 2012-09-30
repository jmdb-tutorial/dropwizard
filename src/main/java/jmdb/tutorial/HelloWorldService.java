package jmdb.tutorial;

import com.google.common.cache.CacheBuilderSpec;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.bundles.AssetsBundle;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;
import jmdb.tutorial.helloworld.HelloWorldResource;
import jmdb.tutorial.person.PersonDAO;
import jmdb.tutorial.person.PersonResource;

public class HelloWorldService extends Service<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldService().run(args);
    }

    private HelloWorldService() {
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
        environment.addResource(new HelloWorldResource(template, defaultName));
        environment.addResource(new PersonResource(new PersonDAO()));
        environment.addHealthCheck(new TemplateHealthCheck(template));
    }

}