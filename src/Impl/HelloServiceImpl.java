package Impl;

import HelloService.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHelloWorld() {
        System.out.println("hello World");
    }

}
