package design_patterns.creational.factory;

import design_patterns.creational.factory.components.button.Button;
import design_patterns.creational.factory.components.menu.Menu;

public interface UIComponentFactory {
    public Button createButton();
    public Menu createMenu();
}
