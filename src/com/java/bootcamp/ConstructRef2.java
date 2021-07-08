package com.java.bootcamp;

class Student{
    private String name;
    private String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

@FunctionalInterface
interface MyInterface3{
    Student createStudent(String name, String age);

}

public class ConstructRef2 {

    public static void main(String[] args) {

        MyInterface3 myInterface3= Student::new;
        System.out.println(myInterface3.createStudent("Shinji","28"));;


    }
}
