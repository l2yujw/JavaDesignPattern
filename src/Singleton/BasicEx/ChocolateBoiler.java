package Singleton.BasicEx;

public class ChocolateBoiler extends Boiler{
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    @Override
    public void fill() {
        if (isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("fill");
        }
        else {
            System.out.println("Noooooo");
        }
    }

    @Override
    public void drain() {
        if (!isEmpty() && isBoiled()){
            empty = true;
            System.out.println("drain");
        }
        else {
            System.out.println("Noooooo");
        }
    }

    @Override
    public void boil() {
        if (!isEmpty() && !isBoiled()){
            boiled = true;
            System.out.println("boil");
        }
        else {
            System.out.println("Noooooo");
        }

    }

    @Override
    public boolean isEmpty() {
        return empty;
    }

    @Override
    public boolean isBoiled() {
        return boiled;
    }
}
