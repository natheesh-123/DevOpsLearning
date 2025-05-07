package com.example.myapacecheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class MyapacecheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyapacecheckApplication.class, args);
	}

}
