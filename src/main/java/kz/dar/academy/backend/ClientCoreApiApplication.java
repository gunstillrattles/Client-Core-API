package kz.dar.academy.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientCoreApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientCoreApiApplication.class, args);
    }

}