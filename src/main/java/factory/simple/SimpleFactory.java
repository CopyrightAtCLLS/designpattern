package factory.simple;

public class SimpleFactory {
    public static product createProduct(String type) {
        if ("apple".equalsIgnoreCase(type)) {
            return new Apple();
        }
        if ("pear".equalsIgnoreCase(type)) {
            return new Pear();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(createProduct("Pear"));
    }
}

abstract class product {

}

class Apple extends product {

}

class Pear extends product {

}