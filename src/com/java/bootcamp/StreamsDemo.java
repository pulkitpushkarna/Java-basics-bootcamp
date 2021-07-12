package com.java.bootcamp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {


    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> integerStream = integerList.stream();
        integerStream.forEach(e-> System.out.println(e));

        integerStream = integerList.stream();
        integerStream.forEach(e-> System.out.println(e));

        integerStream = integerList.stream();
        List<Integer> integers = integerStream.filter(e->e%2==1).collect(Collectors.toList());
        System.out.println(integers);


        System.out.println(integerList.stream().map(e->e*2).collect(Collectors.toList()));

        System.out.println(integerList.stream().filter(e->e%2==1).map(e->e*2).collect(Collectors.toList()));

        System.out.println(integerList.stream().filter(e->e>5).filter(e->e%2==1).map(e->e*2).collect(Collectors.toList()));

        System.out.println(integerList.stream().filter(e -> {
            System.out.println("Filter Greater than 5>>>>>" + e);
            return e > 5;
        })
                .filter(e -> {
                    System.out.println("Filter is odd>>>> " + e);
                    return e % 2 == 1;
                })
                .map(e -> {
                    System.out.println("Map multiply by 2>>>>> " + e);
                    return e * 2;
                })
                .collect(Collectors.toList()));


        System.out.println(">>>>>>>>>>>>>>>>");




        System.out.println(integerList.stream().filter(e -> {
            System.out.println("Filter Greater than 5>>>>>" + e);
            return e > 5;
        })
                .filter(e -> {
                    System.out.println("Filter is odd>>>> " + e);
                    return e % 2 == 1;
                })
                .map(e -> {
                    System.out.println("Map multiply by 2>>>>> " + e);
                    return e * 2;
                })
                .findFirst());


    }
}
