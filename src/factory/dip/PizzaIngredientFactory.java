package factory.dip;

import factory.dip.cheese.Cheese;
import factory.dip.clams.Clams;
import factory.dip.dough.Dough;
import factory.dip.pepperoni.Pepperoni;
import factory.dip.sauce.Sauce;
import factory.dip.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
