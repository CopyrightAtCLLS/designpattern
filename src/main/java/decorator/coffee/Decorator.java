package decorator.coffee;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + super.getPrice() + " && " + drink.getDescription();
    }
}
