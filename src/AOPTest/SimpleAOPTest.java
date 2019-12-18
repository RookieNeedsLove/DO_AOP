package AOPTest;


import Before.Advice;
import Before.BeforeAdvice;
import Before.MethodInvocation;
import Before.SpringAOP;
import HelloService.HelloService;
import Impl.HelloServiceImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SimpleAOPTest {
    @Test
    public void getProxy() throws Exception{
    //1创建一个 Before.MethodInvocation 实现类
        MethodInvocation logTask = () -> System.out.println("log 输出了！");
//        MethodInvocation logTask = new MethodInvocation() {
//            @Override
//            public void invoke() {
//                System.out.println("指针函数！");
//            }
//        };
//        List<Object> list = new ArrayList<>();
//        list.add();
        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();
        //创建一个Advice
        Advice beforeAdvice = new BeforeAdvice(helloServiceImpl,logTask);
//        beforeAdvice.invoke();
        //为目标对象生成代理
        HelloService helloServiceImplProxy = (HelloService)SpringAOP.getProxy(helloServiceImpl,beforeAdvice);
        helloServiceImplProxy.sayHelloWorld();


    }
}
