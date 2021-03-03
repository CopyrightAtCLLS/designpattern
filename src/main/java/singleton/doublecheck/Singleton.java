package singleton.doublecheck;

/**
 * 1、懒加载
 * 2、线程安全
 * 3、可以被反射破坏
 * <p>
 * 问题:new Singleton()的操作不是原子的，分为三条指令
 * 1、分配内存
 * 2、初始化对象(其实是初始化内存)
 * 3、对象指向内存地址
 * JVM为了效率可能会对指令重排，按照132顺序执行
 * 假设A线程执行到3时，B线程执行到了第一次判null的语句，那么就直接给B线程返回了一个未初始化的对象
 * 所以需要给instance成员变量添加上volatile
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
