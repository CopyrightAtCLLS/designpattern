package factory.simple;

/**
 * 简单工厂模式又称静态工厂模式，因为create方法通常是静态的
 * 该模式不能避免代码的侵入性
 */
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