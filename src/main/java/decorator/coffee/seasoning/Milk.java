package decorator.coffee.seasoning;

import decorator.coffee.Decorator;
import decorator.coffee.Drink;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDescription(" Milk ");
        setPrice(2);
    }
}
