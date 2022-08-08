package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherSubject{
    private List<WeatherObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(WeatherObserver obj) {
        observers.add(obj);
    }

    @Override
    public void removeObserver(WeatherObserver obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for (WeatherObserver obj : observers){
            obj.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
