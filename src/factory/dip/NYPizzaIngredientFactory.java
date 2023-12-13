package factory.dip;

import factory.dip.cheese.Cheese;
import factory.dip.cheese.ReggianoCheese;
import factory.dip.clams.Clams;
import factory.dip.clams.FreshClams;
import factory.dip.dough.Dough;
import factory.dip.dough.ThinCrustDough;
import factory.dip.pepperoni.Pepperoni;
import factory.dip.pepperoni.SlicedPepperoni;
import factory.dip.sauce.*;
import factory.dip.veggies.*;

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
