package com.whilebug.baselinecheck;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.whilebug.baselinecheck.mapper")
public class BaselinecheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaselinecheckApplication.class, args);
    }

}
