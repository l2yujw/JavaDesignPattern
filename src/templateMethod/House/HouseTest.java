package templateMethod.House;

public class HouseTest {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        houseType.buildHouse();

        System.out.println();

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
