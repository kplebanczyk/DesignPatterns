package Strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior=new FlyByWings();
        quackBehavior=new Quack();
    }
}
