package com.java.bootcamp;

// Data Encapsulation
class Employee{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


// Abstraction using abstract Class
 abstract class Vehical{


//     abstract int numberOfWheels();
    int numberOfWheels() {
        return 0;
    }
}

class Car extends Vehical{

    @Override
    int numberOfWheels() {
        return 4;
    }
}

class Bike extends Vehical{

    @Override
    int numberOfWheels() {
        return 2;
    }
}

class Boat extends Vehical{

}




// Abstraction using Interface

interface HotDrink{
//    void prepareDrink();

    public  static  final int a=1;

   default void prepareDrink(){
       System.out.println("Preparing Drink");
   }
}

class RandomDrink implements HotDrink{}

class Tea implements HotDrink{

    @Override
    public void prepareDrink() {
        System.out.println("Preparing Tea");
    }
}

class ExpressTea implements HotDrink{

    @Override
    public void prepareDrink() {
        System.out.println("Preparing Express Tea");
    }
}

class Latte implements  HotDrink{

    @Override
    public void prepareDrink() {
        System.out.println("Preparing Latte");
    }
}

class Drink{

    static HotDrink getDrink(){
        return new RandomDrink();
    }
}


class VehicalFactory{

    static Vehical getVehical(){
        return new Boat();
    }
}

/*
*   Interface cannot have constructors / Abstract classes can have constructors
*  Interface variable are public static final by default / Same is not true for abstract classes
*
*
*
* */

public class OopsConcepts {


    public static void main(String[] args) {

        HotDrink hotDrink = Drink.getDrink();
        hotDrink.prepareDrink();

//        Vehical vehical = VehicalFactory.getVehical();
//        System.out.println(vehical.numberOfWheels());;


    }
}

/*
* Play with this, super, private, public, protected
*
* How to constructor
*
* Abstract classes and Interfaces
*
* */