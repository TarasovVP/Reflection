package com.company;

public class OtherInvoker implements Invoker {
    OtherInvoker(){
    }
    @Override
    public void doSomething(String str, int i) {

        System.out.print(str.charAt(str.length()-i));
    }
}
