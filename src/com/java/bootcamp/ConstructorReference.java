package com.java.bootcamp;


@FunctionalInterface
interface MyInterface2{
    String transformCharToString(char [] charArray);
}

public class ConstructorReference {


    public static void main(String[] args) {

        String myString = new String(new char[]{'a','b','c','d'});
        System.out.println(myString);

        MyInterface2 myInterface2 = String::new;
        System.out.println(myInterface2.transformCharToString(new char[]{'s','h','i','n','j'}));;


    }
}
