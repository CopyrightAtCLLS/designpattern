package proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

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
