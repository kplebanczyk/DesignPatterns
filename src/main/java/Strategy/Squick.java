package Strategy;

public class Squick implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Rubber duck squicking");
    }
}
