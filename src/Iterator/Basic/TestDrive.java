package Iterator.Basic;

import Iterator.Basic.Menu.DinerMenu;
import Iterator.Basic.Menu.Menu;
import Iterator.Basic.Menu.PancakeHouseMenu;

public class TestDrive {
    public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        // With iterators
        waitress.printMenu();
    }
}
