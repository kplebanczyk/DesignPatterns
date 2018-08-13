package Observer;

public class StatisticsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;


    public StatisticsDisplay(Subject s) {
        this.weatherData=s;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity and " + pressure + "% pressure");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity = humidity;
        this.pressure=pressure;
        display();

    }
}
