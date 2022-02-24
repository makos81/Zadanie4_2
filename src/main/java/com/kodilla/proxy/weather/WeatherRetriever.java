package com.kodilla.proxy.weather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.lang.Thread.sleep;

public class WeatherRetriever implements WeatherPrediction{
    private final List<String> weathers = new ArrayList<>();

    public WeatherRetriever(){
        weathers.addAll(Arrays.asList("Sunny", "Stormy", "Rainy", "Cloudy"));
    }

    @Override
    public String getWeather() {
        return weathers.get(new Random().nextInt(3));
    }

    @Override
    public String refreshData() throws InterruptedException{
        sleep(5000, 0);
        return "refreshing data finished";
    }
}
