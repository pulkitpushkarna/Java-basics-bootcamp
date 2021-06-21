package com.java.bootcamp;
/*
* OOPS
*
* (1) Abstraction
* (2) Inheritance
* (3) Polymorphism
* (4) Ecapsulation
*
* Function Programming paradigm
*
* (1) Higher order function
* (2) Immutability
* (3) Pure Functions
* */

import java.util.Arrays;
import java.util.List;

/*
*
* Imperative style of coding
*
* What to do and How to do
*
* Declarative Style of coding
*
* What to do
* */


interface Vehical{
    default int numberOfTyres(){
        return 0;
    }
}


//abstract class Vehical{
//     int numberOfTyres(){
//         return 0;
//     }
//}


class Bike implements Vehical{

    @Override
    public int numberOfTyres() {
        return 2;
    }
}

class Car implements Vehical{


    @Override
    public int numberOfTyres() {
        return 4;
    }
}



public class Main {



    public static void main(String[] args) {



    }
}
