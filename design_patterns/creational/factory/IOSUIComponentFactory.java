package design_patterns.creational.factory;

import design_patterns.creational.factory.components.button.Button;
import design_patterns.creational.factory.components.button.IOSButton;
import design_patterns.creational.factory.components.menu.IOSMenu;
import design_patterns.creational.factory.components.menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
     
}
