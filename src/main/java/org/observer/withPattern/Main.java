package org.observer.withPattern;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayTemperatureSensor sensor = new DisplayTemperatureSensor(weatherData);
        weatherData.setMeasurementsChanged(35.0f, 70.0f,29.2f);

    }
}
