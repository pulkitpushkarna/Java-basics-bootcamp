package com.java.bootcamp;


interface MyInterface5{

    default void display(){
        System.out.println("MyInterface5 Default");
    }
}

interface MyInterface6{

    default void display(){
        System.out.println("MyInterface6 Default");
    }
}

class MultiConcreteClass implements MyInterface5,MyInterface6{

    @Override
    public void display(){
        MyInterface6.super.display();
//        System.out.println("MultiConcreteClass");
    }

}


public class MultiInheritance {

    public static void main(String[] args) {

        new MultiConcreteClass().display();

    }


}
