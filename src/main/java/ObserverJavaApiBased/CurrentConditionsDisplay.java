package ObserverJavaApiBased;

import java.util.Observable;
import java.util.Observer;


//Observable=Subject and it is a class, not interface
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable s){
        this.weatherData = s;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }


    //old way not using Java API and push model
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        this.temperature=temp;
//        this.humidity = humidity;
//        display();
//    }

    @Override
    public void update(Observable obs, Object arg) {        //implements pull model by getter methods
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }

    }
}
