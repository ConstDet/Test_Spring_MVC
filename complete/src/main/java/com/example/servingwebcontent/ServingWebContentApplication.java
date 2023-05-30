package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServingWebContentApplication {

    public static void main(String[] args) {
        //без этой команды, по умолчанию, порт 8080, но он занят системой
        System.setProperty("server.port", "8081");
        // или используйте
        // System.getProperties().put("server.port", 8081);
        SpringApplication.run(ServingWebContentApplication.class, args);
    }

}
