package decorator.coffee.seasoning;

import decorator.coffee.Decorator;
import decorator.coffee.Drink;

public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDescription(" Soy");
        setPrice(1.5);
    }
}
