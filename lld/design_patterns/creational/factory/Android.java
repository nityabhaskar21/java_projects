package lld.design_patterns.creational.factory;

public class Android extends Platform {
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
