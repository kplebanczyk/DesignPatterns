package Decorator;

public class DecoratingApps {
    public static void main(String[] args) {

        IApp basicApp = new ConcreteAppBasic();
        IApp extendedApp = new ConcreteAppExtended(basicApp);


        basicApp.commonMethod();
        extendedApp.commonMethod();
        ((ConcreteAppExtended) extendedApp).loginUser();

        IApp DecorateDecorated = new ConcreteAppExtended(extendedApp);
        ((ConcreteAppExtended) DecorateDecorated).loginUser();

        functionThatAcceptsInterfaceObjects(extendedApp);


    }

        private static void functionThatAcceptsInterfaceObjects(IApp iApp){

                System.out.printf("Accepted in the method as IApp");

        }
}
