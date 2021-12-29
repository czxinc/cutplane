package com.edu.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.edu.cn.mapper")
public class CutplaneApplication {

    public static void main(String[] args) {
        SpringApplication.run(CutplaneApplication.class, args);
    }

}
