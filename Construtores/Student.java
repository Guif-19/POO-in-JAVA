package Construtores;

public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }

}