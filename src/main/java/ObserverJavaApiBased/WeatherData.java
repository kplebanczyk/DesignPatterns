package ObserverJavaApiBased;

import java.util.Observable;

/*
Because Observable is a class, you have to subclass it. That means you can’t add
on the Observable behavior to an existing class that already extends another superclass.
Second, because there isn’t an Observable interface, you can’t even create your own
implementation that plays well with Java’s built-in Observer API.
 */


public class WeatherData extends Observable {
    private float temperature;              //these are Subject's state variableb
    private float humidity;
    private float pressure;

    public WeatherData(){   //no need to maintain own list of observers, API does it
    }


    public void measurementsChanged() {     //this comes from design of WeatherData API
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) { //need for testability of the example
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //these three methods are needed to implement 'pull' type of state change distribution
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
