package decorator.pizzaOrder;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new ThinPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Olive(cheesePizza);

        System.out.println(greekPizza.getDescription()
                + " $" + greekPizza.cost());
    }
}
