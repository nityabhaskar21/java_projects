package design_patterns.creational.factory;

public class Platform {
    private String pl;
    Platform(){

    }
    Platform(String pl){
        this.pl = pl;
    }
    public void setTheme(){
        System.out.println("Set a theme!");
    }

    public void setRefreshRate(){
        System.out.println("Set refresh");
    }

    public UIComponentFactory createUIComponentFactory(){
        return UIFactory.createUIComponentFactoryByPlatform(this.pl);
    }
}
