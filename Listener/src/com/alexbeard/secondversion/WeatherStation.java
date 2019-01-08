package com.alexbeard.secondversion;

import com.alexbeard.fistversion.CurrentConditionsDisplay;
import com.alexbeard.fistversion.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(28, 765, 96);

    }
}
