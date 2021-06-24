package com.java.bootcamp;

class Person{
    private String name;
    private int age;
    static int numberOfPerson=0;

    public Person() {
        numberOfPerson++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfPerson++;
    }

    public String getName() {
        return "Mr. "+name;
    }

    public void setName(String name) {
        if(name.equals("")){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + age +
                '}';
    }
}

public class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person("Shinji",28);
//        person.setName("Shinji");
//        person.setAge(28);
        System.out.println(person);
        System.out.println(person.numberOfPerson);

        Person person2 = new Person("pulkit",31);
//        person2.setName("Pulkit");
//        person2.setAge(31);
        System.out.println(person2);
        System.out.println(person2.numberOfPerson);


    }

}
