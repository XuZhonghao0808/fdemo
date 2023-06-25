package com.fdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fdemo.mapper")
public class FdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FdemoApplication.class, args);
	}

}
