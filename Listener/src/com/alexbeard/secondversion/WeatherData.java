package com.alexbeard.secondversion;


import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float t, float p, float h){
        temperature = t;
        pressure = p;
        humidity = h;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
