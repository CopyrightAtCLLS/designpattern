package factory;

public interface Factory {

    Product createProduct();

    public static void main(String[] args) {
        Factory factory = new AppleFactory();
        System.out.println(factory.createProduct());
    }
}

interface Product {

}

class Apple implements Product {
}

class Pear implements Product {
}

class AppleFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Apple();
    }
}

class PearFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Pear();
    }
}