package Strategy;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    //odseparuj zmienne części w osobne obiekty: performFly i performQuack delegują zmienne zachowania do wydzielonych obiektów


    public  void performFly(){
        flyBehavior.fly();
    }

    public void performQuack() {    //dewlegacja akcji do specjalizowanego obiektu
        quackBehavior.quack();
    }

    public void display(){  //a to się nie zmienia w zalezności od rodzaju kaczki
        System.out.println("I am "+this.getClass().getCanonicalName());
    }
}
