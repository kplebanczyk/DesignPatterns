package Strategy;

public class FlyByWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("flies by wings");
    }
}
