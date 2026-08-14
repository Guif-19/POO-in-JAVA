package Heranca.Super;

public class Student extends Person {

    double gpa;
    boolean isEnrolled;

    Student(String first, String last, double gpa){
        super(first,last);
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.first + " está estudando");
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }

}

