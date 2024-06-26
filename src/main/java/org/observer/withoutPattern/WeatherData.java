package org.observer.withoutPattern;

public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    private DisplayTemperatureSensor sensor;

    public WeatherData() {
        this.sensor = new DisplayTemperatureSensor();
    }

    public void measurementsChanged(){
        float temperature = this.getTemperature();
        float humidity = this.getHumidity();
        float pressure = this.getPressure();

        sensor.update(temperature,humidity,pressure);

    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
