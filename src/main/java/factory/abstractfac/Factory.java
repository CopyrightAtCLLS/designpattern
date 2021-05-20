package factory.abstractfac;

/**
 * 抽象工厂相比于普通工厂，让每个工厂不止能生产一种产品
 * 但是缺点是，抽象工厂又导致了代码的侵入性
 */
public interface Factory {
    Food createA();

    Food createB();

    public static void main(String[] args) {
        System.out.println(new MeatFactory().createA());
        System.out.println(new FruitFactory().createA());
    }
}

interface Food {
}

class Beef implements Food {
}

class Mutton implements Food {
}

class Peach implements Food {
}

class Apple implements Food {
}

class MeatFactory implements Factory {
    @Override
    public Food createA() {
        return new Beef();
    }

    @Override
    public Food createB() {
        return new Mutton();
    }
}

class FruitFactory implements Factory {
    @Override
    public Food createA() {
        return new Peach();
    }

    @Override
    public Food createB() {
        return new Apple();
    }
}


