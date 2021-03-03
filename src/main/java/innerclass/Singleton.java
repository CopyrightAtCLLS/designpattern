package innerclass;

/**
 * 1、懒加载
 * 2、线程安全
 *
 * 特性:内部类在程序启动时不会被加载，只有第一次被调用时才加载
 */
public class Singleton {

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
