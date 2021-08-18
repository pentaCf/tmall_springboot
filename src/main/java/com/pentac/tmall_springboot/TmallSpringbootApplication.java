package com.pentac.tmall_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pentac.tmall_springboot.mapper")
public class TmallSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmallSpringbootApplication.class, args);
    }

}
