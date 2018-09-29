package com.company;

public class OtherInvoker implements Invoker {
    OtherInvoker(){
    }
    @Override
    public void doSomething(String str, int i) {
        StringBuilder strb = new StringBuilder(str);
        System.out.print(strb.reverse().charAt(i));
    }
}
