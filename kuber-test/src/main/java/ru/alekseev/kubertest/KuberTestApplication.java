package ru.alekseev.kubertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class KuberTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(KuberTestApplication.class, args);
    }

}
