package com.example.scconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ScconfigApplication {

    String teste;
    public static void main(String[] args) {
        SpringApplication.run(ScconfigApplication.class, args);
    }

}

class Outro {
    int id;

}


class Teste {

}