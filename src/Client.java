import components.buttons.Button;
import components.menus.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();

        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
    }
}