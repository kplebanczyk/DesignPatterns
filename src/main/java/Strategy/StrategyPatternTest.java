package Strategy;

/**
 * The Strategy Pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from
 * clients that use it.
 */
public class StrategyPatternTest {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        rubber.display();
        rubber.performFly();
        rubber.performQuack();




    }
}
