package Before;

import java.lang.reflect.Proxy;

public class SpringAOP {
//    public static void main(String []args){
//
//    }
    public static Object getProxy(Object bean, Advice advice){

        return Proxy.newProxyInstance(SpringAOP.class.getClassLoader(),bean.getClass().getInterfaces(),advice);
    }
}
