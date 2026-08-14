package Construtores;

public class Main {

    public static void main(String[] args){

        //noção de construtores

        Student student1 = new Student("Spongebob", 30);
        Student student2 = new Student("Patrick", 34);
        Student student3 = new Student("Sandy", 27);

        student1.study();
        student2.study();
        student3.study();

    }
}