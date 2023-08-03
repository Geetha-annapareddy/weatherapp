package com.example.weatheraepp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.weatheraepp.entity.ApiResponse;

import reactor.core.publisher.Mono;

@Service
public class WeatherService {
	private final WebClient webClient;
	public WeatherService() {
		this.webClient =  WebClient.create("https://api.openweathermap.org/data/2.5/");
		// TODO Auto-generated constructor stub
	}
//	public WebClient getWebClient() {
//		return webClient;
//	}
	public Mono<ApiResponse> getWeatherData(String city,String units) {
        String apiKey = "0f559a2e806db568bfa821a5f836d33f";
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/weather")
                        .queryParam("q", city)
                        .queryParam("appid", apiKey)
                        .queryParam("units", units)
                        .build())
                .retrieve()
                .bodyToMono(ApiResponse.class);
    }
}
