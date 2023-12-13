package decorator.pizzaOrder;

public class Olive extends ToppingDecorator{

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost() + .30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olive";
    }
}
