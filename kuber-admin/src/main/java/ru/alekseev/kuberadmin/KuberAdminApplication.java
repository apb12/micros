package ru.alekseev.kuberadmin;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class KuberAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(KuberAdminApplication.class, args);
    }

}
