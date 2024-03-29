package lld.design_patterns.creational.factory;

import lld.design_patterns.creational.factory.components.button.Button;
import lld.design_patterns.creational.factory.components.button.IOSButton;
import lld.design_patterns.creational.factory.components.menu.IOSMenu;
import lld.design_patterns.creational.factory.components.menu.Menu;

public class IOSUIComponent implements UIComponentFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
    
}
