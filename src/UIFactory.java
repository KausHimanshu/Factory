import components.buttons.Button;
import components.dropdowns.Dropdown;
import components.menus.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
