package com.java.bootcamp;


interface MyInterface4{
    void display();
    default void display2(){
        System.out.println("Default method display 2");
    }
}

class MyConcreteClass implements MyInterface4{


    @Override
    public void display() {
        System.out.println("Display from MyConcreteClass1");
    }


}

class MyConcreteClass2 implements MyInterface4{

    @Override
    public void display() {
        System.out.println("Display from MyConcreteClass2");
    }


}

class MyConcreteClass3 implements MyInterface4{

    @Override
    public void display() {
        System.out.println("Display from MyConcreteClass3");
    }

    @Override
    public void display2() {

    }
}

public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        MyInterface4 myInterface4 = new MyConcreteClass();
        myInterface4.display2();
        new MyConcreteClass2().display2();
        new MyConcreteClass3().display2();
    }
}
