import components.buttons.IOSButton;
import components.dropdowns.IOSDropdown;
import components.menus.IOSMenu;

public class IOSUIFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropdown createDropdown() {
        return new IOSDropdown();
    }
}
