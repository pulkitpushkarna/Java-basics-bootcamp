package com.java.bootcamp;


import java.util.function.*;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        Consumer<Integer> consume= a-> System.out.println(++a);
        consume.accept(2);


        Function<Integer,String> function = a->">>>>>"+a+2;
        System.out.println(function.apply(3));

        Supplier<Integer> supplier = ()->2;
        System.out.println(supplier.get());

        Predicate<Integer> odd= MethodReferencingDemo::odd;
        System.out.println(odd.test(5));;


    }
}
