package Singleton.BasicEx;

public class ChocolateBoilerTest {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
        chocolateBoiler.boil();

        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
        chocolateBoiler1.boil();
    }
}
