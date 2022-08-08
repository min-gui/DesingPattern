package observer;

public interface WeatherSubject {
    public void registerObserver(WeatherObserver obj);
    public void removeObserver(WeatherObserver obj);
    public void notifyObserver();
}
