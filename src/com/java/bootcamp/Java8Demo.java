package com.java.bootcamp;

import java.util.Arrays;
import java.util.List;


@FunctionalInterface
interface MyInterface{
    void display();
}

public class Java8Demo{

    public static void main(String[] args) {
        System.out.println(">>>>>>>Imperative Style>>>>>");
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        for(int i=0;i<integerList.size();i++){
            System.out.println(integerList.get(i));
        }
        System.out.println(">>>>>>>Declarative Style>>>>>");
        integerList.forEach(e-> System.out.println(e));


        // Anonymouse Inner class
        MyInterface myInterface = new MyInterface() {
            @Override
            public void display() {
                System.out.println("Hello Anonymouse inner class");
            }
        };

        myInterface.display();

        myInterface = ()->System.out.println("Hello lambdas");
        myInterface.display();



    }
}
