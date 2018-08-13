package ObserverJavaApiBased;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Observable weatherData;


    public StatisticsDisplay(Observable s) {
        this.weatherData=s;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Stats: Temperature: " + temperature
                + "F degrees and " + humidity + "% humidity and " + pressure + "% pressure");
    }



    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            this.pressure=weatherData.getPressure();
            display();
        }

    }
}
