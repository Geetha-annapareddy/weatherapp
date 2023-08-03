package com.example.weatheraepp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.example.weatheraepp")
public class WeatherappApplication{

	public static void main(String[] args) {
		SpringApplication.run(WeatherappApplication.class, args);
	}

}
