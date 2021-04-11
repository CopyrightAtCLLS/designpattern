package decorator.coffee.seasoning;

import decorator.coffee.Decorator;
import decorator.coffee.Drink;

public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDescription(" Chocolate ");
        setPrice(3);
    }
}
