package ru.fox.service.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@SpringBootApplication
@ComponentScan(basePackages = "ru.fox.service")
@EnableJpaRepositories(basePackages = "ru.fox.service.repositories")
@EntityScan(basePackages = "ru.fox.service.models")
public class Application {

    @Autowired
    private DataSource dataSource;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
