package com.alexbeard.fistversion;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
    private float temperature;
    private float pressure;
    private float humidity;
    private ISubject weatherData;

    public CurrentConditionsDisplay(ISubject wd) {
        weatherData = wd;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %f C degrees, %f %% humidity, %f Pa pressure", temperature, humidity, pressure));
    }

    @Override
    public void update(float tempetatura, float pressure, float humidity) {
        this.temperature = tempetatura;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
