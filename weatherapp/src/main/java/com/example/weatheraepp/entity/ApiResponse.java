package com.example.weatheraepp.entity;

import java.util.List;

public class ApiResponse {
	 private String name;
	    private MainData main;
	    private List<WeatherData> weather;
	public ApiResponse() {
		// TODO Auto-generated constructor stub
	}
	
	   
	    // getters and setters

	    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


		public MainData getMain() {
		return main;
	}


	public void setMain(MainData main) {
		this.main = main;
	}


		public List<WeatherData> getWeather() {
		return weather;
	}


	public void setWeather(List<WeatherData> weather) {
		this.weather = weather;
	}


		public static class MainData {
	        private double temp;
	        private double feels_like;
private double humidity;
	        // getter and setter

	        public double getTemp() {
	            return temp;
	        }

	        public void setTemp(double temp) {
	            this.temp = temp;
	        }

			public double getFeels_like() {
				return feels_like;
			}

			public void setFeels_like(double feels_like) {
				this.feels_like = feels_like;
			}

			public double getHumidity() {
				return humidity;
			}

			public void setHumidity(double humidity) {
				this.humidity = humidity;
			}
	    }
		public static class WeatherData {
	        private int id;
	        private String main;
	        private String description; // Add the description field
	        private String icon;
	        
	        // getters and setters

	        public String getDescription() {
	            return description;
	        }

	        public void setDescription(String description) {
	            this.description = description;
	        }

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getMain() {
				return main;
			}

			public void setMain(String main) {
				this.main = main;
			}

			public String getIcon() {
				return icon;
			}

			public void setIcon(String icon) {
				this.icon = icon;
			}
		}
	}

