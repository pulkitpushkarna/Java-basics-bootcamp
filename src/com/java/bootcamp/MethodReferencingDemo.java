package com.java.bootcamp;


import java.util.function.Predicate;

public class MethodReferencingDemo {

    static boolean odd(int a){
        System.out.println("Value entered by system ::"+a);
        return a%2==1;
    }

    public static void main(String[] args) {

        Predicate<Integer> predicate=MethodReferencingDemo::odd;
        System.out.println(predicate.test(5));;

    }
}
