package com.kodilla.proxy.weather;

import java.util.Random;

public class WeatherApp {
    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int n = 0; n < 5; n++) {
            WeatherPrediction weatherPrediction = new LazyWeatherRetrieverProxy();
            int number = new Random().nextInt(100);
            if (number < 20)
                System.out.println(weatherPrediction.refreshData());
            else{
                System.out.println(weatherPrediction.getWeather());
            }

            System.out.println("Execution #" + n + " just finished");
        }

        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }
}
