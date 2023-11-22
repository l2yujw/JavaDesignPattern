package Factory.Dip;

import Factory.Dip.Cheese.Cheese;
import Factory.Dip.Cheese.ReggianoCheese;
import Factory.Dip.Clams.Clams;
import Factory.Dip.Clams.FreshClams;
import Factory.Dip.Dough.Dough;
import Factory.Dip.Dough.ThinCrustDough;
import Factory.Dip.Pepperoni.Pepperoni;
import Factory.Dip.Pepperoni.SlicedPepperoni;
import Factory.Dip.Sauce.*;
import Factory.Dip.Veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
