package com.example.springbootspringmvcexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@SpringBootApplication
public class SpringbootSpringmvcExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSpringmvcExamplesApplication.class, args);
    }

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
