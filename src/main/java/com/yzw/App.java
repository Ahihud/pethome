package com.yzw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yzw.*.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
