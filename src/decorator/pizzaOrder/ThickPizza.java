package decorator.pizzaOrder;

public class ThickPizza extends Pizza{
    public ThickPizza() {
        description = "Thick pizza with tomato sauce";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
