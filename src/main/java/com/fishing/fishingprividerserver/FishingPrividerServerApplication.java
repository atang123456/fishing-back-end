package com.fishing.fishingprividerserver;


import com.example.fishingcommonapi.entites.AdminChecking;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fishing.fishingprividerserver.dao")
public class FishingPrividerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FishingPrividerServerApplication.class, args);
    }
}
