package iterator.basic;

import iterator.basic.menu.DinerMenu;
import iterator.basic.menu.Menu;
import iterator.basic.menu.PancakeHouseMenu;

public class TestDrive {
    public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        // With iterators
        waitress.printMenu();
    }
}
