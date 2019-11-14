package webservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@SpringBootApplication
public class TutorialApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TutorialApplication.class, args);
    }

}
