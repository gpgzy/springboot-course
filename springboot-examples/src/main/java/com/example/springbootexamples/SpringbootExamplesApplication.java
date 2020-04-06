package com.example.springbootexamples;

import com.example.springbootexamples.repoistory.impl.BaseRespostoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = BaseRespostoryImpl.class)
public class SpringbootExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootExamplesApplication.class, args);
    }
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
