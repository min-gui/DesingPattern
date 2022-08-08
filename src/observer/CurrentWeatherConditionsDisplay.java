package observer;

public class CurrentWeatherConditionsDisplay implements WeatherObserver , DisplayElement{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;


    public CurrentWeatherConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태" + temperature + " degree" + humidity + "% humidity");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }


}
