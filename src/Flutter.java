public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme(){
        System.out.println("Setting Theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting Refresh Rate");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.getUIFactoryForPlatform(supportedPlatform);
    }
}
