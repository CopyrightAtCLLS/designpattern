package singleton;

import singleton.innerclass.Singleton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionIntrusion {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor constructor=null;

        try {
            constructor=Class.forName("singleton.innerclass.Singleton").getDeclaredConstructor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(constructor!=null){
            constructor.setAccessible(true);
            Singleton singleton1=(Singleton)constructor.newInstance();
            Singleton singleton2=(Singleton)constructor.newInstance();
            System.out.println(singleton1==singleton2);
        }
    }
}
