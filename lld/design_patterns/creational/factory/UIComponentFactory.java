package lld.design_patterns.creational.factory;

import lld.design_patterns.creational.factory.components.button.Button;
import lld.design_patterns.creational.factory.components.menu.Menu;

public interface UIComponentFactory {
    public Button createButton();
    public Menu createMenu();
}
