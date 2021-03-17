package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 1、接口
 * 2、实现类
 * 3、代理类
 * 优点:
 * 1、代理类通过invoke方法，可以为任何接口实现类实现相同的增强逻辑，即使并不是同一个接口
 * 2、代理类动态生成
 */
public class Cinema implements InvocationHandler {
    private Object movie;

    public Cinema(Object movie) {
        this.movie = movie;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Wanda Cinema");
        method.invoke(movie, args);
        System.out.println("End");
        return null;
    }

    public static void main(String[] args) {
        InvocationHandler cinema = new Cinema(new Avatar());
        Movie avatar = (Movie) Proxy.newProxyInstance(Avatar.class.getClassLoader(), Avatar.class.getInterfaces(), cinema);
        avatar.show();

        System.out.println("----------------------");
        Movie tenet = (Movie) Proxy.newProxyInstance(Tenet.class.getClassLoader(), Tenet.class.getInterfaces(), new Cinema(new Tenet()));
        tenet.show();

        System.out.println("----------------------");
        System.out.println(avatar.getClass().getName() + " " + tenet.getClass().getName());
        System.out.println(avatar.getClass().hashCode() + " " + tenet.getClass().getName().hashCode());
    }
}
