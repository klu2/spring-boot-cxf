package cc.catalysts.tutorials.springbootcsx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Klaus Lehner
 */
@EnableAutoConfiguration
@ImportResource(value = "classpath:beans.xml")
@ComponentScan
public class ClientApplication {


    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(new Object[]{ClientApplication.class});
        application.run(args);
    }

}
