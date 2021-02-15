package cybersec.cloud.calcolatrice;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class CalcolatriceApp extends Application<Configuration> {
    
    public static void main(String[] args) throws Exception {
        new CalcolatriceApp().run(args);
    }
    
    @Override
    public void run(Configuration configuration, Environment environment) {
        final Calcolatrice risorsaCalcolatrice  = new Calcolatrice();
        environment.jersey().register(risorsaCalcolatrice);
    }
    
}
