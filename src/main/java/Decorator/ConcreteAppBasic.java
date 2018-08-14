package Decorator;

public class ConcreteAppBasic implements IApp{
    private boolean isLoginSupported;

    public ConcreteAppBasic() {
        this.isLoginSupported = isLoginSupported;
            }

    @Override
    public void commonMethod() {
        System.out.println("Shared method from ConcreteAppBasic");
    }

}
