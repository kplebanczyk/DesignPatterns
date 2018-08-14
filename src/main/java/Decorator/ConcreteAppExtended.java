package Decorator;

public class ConcreteAppExtended implements IAppDecorator{
    private boolean isLoginSupported;
    private IApp app;
    public ConcreteAppExtended(IApp application) {
        this.isLoginSupported = true;
        this.app=application;
    }


    @Override
    public void commonMethod() {
        System.out.println("Shared method from ConcreteAppExtended");
    }
    public void loginUser(){
        System.out.println("Can LogIn from "+this.toString());
    }
}
