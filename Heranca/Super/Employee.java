package Heranca.Super;

public class Employee extends Person {

    int salary;

    Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salary is $"  + this.salary);
    }

}
