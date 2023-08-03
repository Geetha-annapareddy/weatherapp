package com.example.weatheraepp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.weatheraepp.entity.ApiResponse;
import com.example.weatheraepp.service.WeatherService;

import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
public class WeatherController {
	private final WeatherService weatherService = new WeatherService();
//	public WeatherController() {
//		this.weatherService = new WeatherService();
//		// TODO Auto-generated constructor stub
//	}
	public WeatherService getWeatherService() {
		return weatherService;
	}
	@GetMapping("/weather/{city}")
    public Mono<ApiResponse> getWeather(@PathVariable String city,@RequestParam(defaultValue = "metric") String units) {
        return weatherService.getWeatherData(city,units);
    }
	@GetMapping("/welcome")
    public String getWelcome() {
        return "HelloWorld";
    }
	
}
