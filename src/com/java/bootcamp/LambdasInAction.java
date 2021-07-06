package com.java.bootcamp;


@FunctionalInterface
interface MyFunctionalInterface{
    int display(int a, int b);
}

public class LambdasInAction {
    public static void main(String[] args) {
//        MyFunctionalInterface myFunctionalInterface = (int number1,int number2)-> {return (number1+number2);};
        MyFunctionalInterface myFunctionalInterface = (number1,number2)-> (number1+number2);
        System.out.println(myFunctionalInterface.display(3,2));;
    }
}
