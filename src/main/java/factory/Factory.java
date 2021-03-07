package factory;

/**
 * 普通工厂模式，该模式相比简单工厂模式，代码不具有侵入性
 * 缺点是，每个工厂只生产一种产品，导致创建工厂实现类过多
 */
public interface Factory {

    Fruit createProduct();

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