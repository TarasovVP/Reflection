package com.company;

import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException{
        int number = 0;
        String fileName = "";
        System.out.println("Введите строку ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введите порядковый номер: ");
        int num = sc.nextInt();
        System.out.println("Введите вариант решения:");
        System.out.println("1. Если необходимо взять символ с начала строки - нажмите 1:");
        System.out.println("2. Если необходимо взять символ с конца строки нажмите 2: ");
        do {
            number = sc.nextInt();
            if (number == 1) {
                fileName = "src\\StandartInvoker.txt";
            }
            if (number == 2) {
                fileName = "src\\OtherInvoker.txt";
            }


        } while (number == (1 | 2));


        try {
            File f = new File(fileName);
            Scanner scan = new Scanner(f);
            String stroka = scan.nextLine();
            Class cl = Class.forName(stroka);
            Object ob = cl.newInstance();
            Invoker invoker = (Invoker) ob;
            invoker.doSomething(str, num);
            System.out.println();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
