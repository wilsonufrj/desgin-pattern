package org.observer.withPattern;

public class DisplayTemperatureSensor implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public DisplayTemperatureSensor(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature,float humidity,float pressure){
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
        display();
    }

    @Override
    public void display() {
        System.out.println("Currente condition: "+ getTemperature()+" °C, humidity: "+getHumidity()+ " pressure: "+getPressure());
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
