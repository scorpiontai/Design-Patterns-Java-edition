package com.alexbeard.fistversion;

import java.util.ArrayList;

public class WeatherData implements ISubject {
    private ArrayList observersList;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observersList = new ArrayList();
    }


    @Override
    public void registerObserver(IObserver o) {
        observersList.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        int i = observersList.indexOf(o);
        if(i >= 0)
            observersList.remove(i);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observersList.size(); i++) {
            IObserver observer = (IObserver)observersList.get(i);
            observer.update(temperature, pressure, humidity);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float t, float p, float h){
        temperature = t;
        pressure = p;
        humidity = h;
        measurementsChanged();
    }
}
