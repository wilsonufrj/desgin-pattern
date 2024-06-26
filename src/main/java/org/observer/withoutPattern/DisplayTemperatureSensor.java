package org.observer.withoutPattern;

public class DisplayTemperatureSensor {
    private float temperature;
    private float humidity;
    private float pressure;

    public DisplayTemperatureSensor() {
    }

    public void update(float temperature,float humidity,float pressure){
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
        System.out.println(this);
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

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
