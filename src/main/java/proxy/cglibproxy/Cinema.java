package proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * 优点:
 * 1、性能比jdk动态代理好
 * 缺点:
 * 1、创建对象比jdk动态代理慢很多
 * 2、对于final方法，无法进行代理
 *
 * 单例的对象，因为无需频繁创建对象，用CGLib合适，反之，使用JDK方式要更为合适一些。
 * 同时，由于CGLib是采用动态创建子类的方法,对于final方法，无法进行代理
 */
public class Cinema implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Wanda Cinema");
        methodProxy.invokeSuper(o, objects);
        System.out.println("End");
        return null;
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Avatar.class);
        enhancer.setCallback(new Cinema());
        Avatar avatar = (Avatar) enhancer.create();
        avatar.show();
    }
}
