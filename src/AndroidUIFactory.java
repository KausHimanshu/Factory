import components.buttons.AndroidButton;
import components.buttons.Button;
import components.dropdowns.AndroidDropdown;
import components.dropdowns.Dropdown;
import components.menus.AndroidMenu;
import components.menus.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
