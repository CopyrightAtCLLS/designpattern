package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
    }
}
