package decorator.pizzaOrder;

public class Cheese extends ToppingDecorator{
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
}
