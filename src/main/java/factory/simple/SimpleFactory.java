package factory.simple;

public class SimpleFactory {
    public static Fruit createFruit(String type) {
        if ("apple".equalsIgnoreCase(type)) {
            return new Apple();
        }
        if ("pear".equalsIgnoreCase(type)) {
            return new Pear();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(createFruit("Pear"));
    }
}

abstract class Fruit {

}

class Apple extends Fruit {

}

class Pear extends Fruit {

}