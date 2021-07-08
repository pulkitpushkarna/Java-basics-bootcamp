package com.java.bootcamp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaDefinedFI {

    public static void main(String[] args) {

        Supplier<Integer> supplier = ()->2;
        System.out.println(supplier.get());

        Function<Integer,Integer> function = e->e*2;
        System.out.println(function.apply(4));

        Predicate<Integer> predicate = e -> e%2==1;
        System.out.println(predicate.test(3));

        Consumer<Integer> consumer = e-> System.out.println("Your number is ::"+e);
        consumer.accept(10);

    }
}
