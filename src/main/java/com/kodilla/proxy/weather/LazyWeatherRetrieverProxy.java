package com.kodilla.proxy.weather;

import static java.util.Objects.isNull;

public class LazyWeatherRetrieverProxy implements WeatherPrediction{
    private WeatherPrediction weatherPrediction;

    @Override
    public String getWeather() {
        if(isNull(weatherPrediction)){
            weatherPrediction = new WeatherRetriever();
        }
        return weatherPrediction.getWeather();
    }

    @Override
    public String refreshData() throws InterruptedException {
        if(isNull(weatherPrediction)){
            weatherPrediction = new WeatherRetriever();
        }
        return weatherPrediction.refreshData();
    }
}
