package factory;

public class Factory {

    public static void main(String[] args) {
        Factory factory = new AppleFactory();
        System.out.println(factory.createProduct());
    }
}

interface Fruit {

}

class Apple implements Fruit {
}

class Pear implements Fruit {
}

class FactoryModel{
    Fruit createFruit
}

class AppleFactory implements Factory {
    @Override
    public Fruit createProduct() {
        return new Apple();
    }
}

class PearFactory implements Factory {
    @Override
    public Fruit createProduct() {
        return new Pear();
    }
}