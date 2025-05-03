package com.example.zipkin.zipkin_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@SpringBootApplication
public class ZipkinDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZipkinDemoApplication.class, args);
	}
}
