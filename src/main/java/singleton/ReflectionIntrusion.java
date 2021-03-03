package singleton;

import singleton.innerclass.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 要禁止反射破坏，等价于禁止JVM通过反射获取类的私有方法
 * JVM提供了这样的机制，也就是枚举类型
 * 反射无法获取枚举类型的构造器，因而无法破坏。枚举类型本身还保证线程安全。
 * 但是枚举类型无法懒加载
 */
public class ReflectionIntrusion {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor constructor = null;

        try {
            constructor = Class.forName("singleton.innerclass.Singleton").getDeclaredConstructor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (constructor != null) {
            constructor.setAccessible(true);
            Singleton singleton1 = (Singleton) constructor.newInstance();
            Singleton singleton2 = (Singleton) constructor.newInstance();
            System.out.println(singleton1 == singleton2);
        }
    }
}
