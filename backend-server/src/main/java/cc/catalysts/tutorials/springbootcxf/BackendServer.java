package cc.catalysts.tutorials.springbootcxf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Klaus Lehner
 */
@Configuration
@ImportResource(value = "classpath:beans.xml")
@EnableAutoConfiguration
@ComponentScan
public class BackendServer {

    public static void main(String[] args) {
        SpringApplication.run(BackendServer.class, args);
    }
}