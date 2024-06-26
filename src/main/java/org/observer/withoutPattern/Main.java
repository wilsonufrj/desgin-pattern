package org.observer.withoutPattern;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setTemperature(35.0f);
        weatherData.setHumidity(70.0f);
        weatherData.setPressure(29.2f);

        weatherData.measurementsChanged();

    }
}
