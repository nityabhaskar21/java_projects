package design_patterns.creational.factory;

import design_patterns.creational.factory.components.button.AndroidButton;
import design_patterns.creational.factory.components.button.Button;
import design_patterns.creational.factory.components.menu.AndroidMenu;
import design_patterns.creational.factory.components.menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
    
}
