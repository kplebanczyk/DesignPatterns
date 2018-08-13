package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observers;       //list of observers who have registered
    private float temperature;              //these are Subject's state variableb
    private float humidity;
    private float pressure;

    public WeatherData(){
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers) {
            o.update(temperature,humidity,pressure);
        }

    }

    public void measurementsChanged() {     //this comes from design of WeatherData API
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) { //need for testability of the example
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
