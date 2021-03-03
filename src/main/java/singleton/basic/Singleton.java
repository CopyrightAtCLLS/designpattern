package singleton.basic;

/**
 * 1、懒加载
 * 2、线程不安全
 * 3、可以被反射破坏
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }


    public Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
