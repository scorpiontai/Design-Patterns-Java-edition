package com.alexbeard.secondversion;



import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, IDisplayElement {
    private float temperature;
    private float pressure;
    private float humidity;
    Observable observable;

    public CurrentConditionsDisplay(Observable wd) {
        observable = wd;
        observable.addObserver((Observer) this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %f C degrees, %f %% humidity, %f Pa pressure", temperature, humidity, pressure));
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
