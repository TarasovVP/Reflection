package com.company;

public class StandartInvoker implements Invoker{
    StandartInvoker(){
    }
    @Override
    public void doSomething(String str, int i) {
        System.out.print(str.charAt(i));
    }
}
