package Factory.Dip;

import Factory.Dip.Cheese.Cheese;
import Factory.Dip.Clams.Clams;
import Factory.Dip.Dough.Dough;
import Factory.Dip.Pepperoni.Pepperoni;
import Factory.Dip.Sauce.Sauce;
import Factory.Dip.Veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
