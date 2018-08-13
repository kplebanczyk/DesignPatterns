package Observer;

public interface Observer { //used to push Subject's state
    public void update(float temp, float humidity, float pressure);
}
