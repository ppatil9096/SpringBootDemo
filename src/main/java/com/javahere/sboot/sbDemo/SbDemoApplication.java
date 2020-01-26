package com.javahere.sboot.sbDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.javahere.sboot.sbDemo.repository")
@EntityScan("com.javahere.sboot.sbDemo.model")
@SpringBootApplication
// @EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class}) // disable the white label error page
public class SbDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbDemoApplication.class, args);
    }

}
