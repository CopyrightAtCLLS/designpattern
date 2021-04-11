package decorator.coffee;

import decorator.coffee.seasoning.Chocolate;
import decorator.coffee.seasoning.Milk;
import decorator.coffee.type.LongBlack;

public class CoffeeShop {
    public static void main(String[] args) {
        Drink drink = new LongBlack();
        drink = new Milk(drink);
        drink = new Chocolate(drink);
        drink = new Chocolate(drink);
        System.out.println(drink.getDescription());
        System.out.println(drink.cost());
    }
}
