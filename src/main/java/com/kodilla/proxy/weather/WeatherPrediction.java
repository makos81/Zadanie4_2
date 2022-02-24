package com.kodilla.proxy.weather;

public interface WeatherPrediction {
    String getWeather();
    String refreshData() throws InterruptedException;
}
