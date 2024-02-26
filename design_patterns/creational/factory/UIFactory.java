package design_patterns.creational.factory;

public class UIFactory {
    public static UIComponentFactory createUIComponentFactoryByPlatform(String pl){
        if(pl.equals("Andriod")){
            return new AndroidUIComponentFactory();
        } else if (pl.equals("IOS")){
            return new IOSUIComponentFactory();
        }
        return null;
    }
}
