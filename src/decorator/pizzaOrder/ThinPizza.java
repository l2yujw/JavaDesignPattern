package decorator.pizzaOrder;

public class ThinPizza extends Pizza{

    public ThinPizza() {
        description = "Thin Pizza with tomato sauce";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
