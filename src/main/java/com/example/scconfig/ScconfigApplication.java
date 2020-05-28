package com.example.scconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@Slf4j
@SpringBootApplication
@EnableConfigServer
public class ScconfigApplication {


    int age;


    public static void main(String[] args) {
        SpringApplication.run(ScconfigApplication.class, args);
    }


    private void x() {
        System.out.println(123);
    }
}

class BranchC {
    int id;
    String nome;
    String sobrenome;
}