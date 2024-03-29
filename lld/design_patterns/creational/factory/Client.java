package lld.design_patterns.creational.factory;

public class Client {
    public static void main(String[] args) {
        Platform platform = new IOS();
        // Platform platform = new Android();
        UIComponentFactory uiCompFactory = platform.createUIComponentFactory();
        var button = uiCompFactory.createButton();
        var menu = uiCompFactory.createMenu();

        System.out.println(button.getSize());
        System.out.println(menu.getColor());

    }
    
}
