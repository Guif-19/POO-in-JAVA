package Heranca.Super;

public class Main {
    public static void main(String[] args) {

        //super
        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.25);

        person.showName();
        student.showName();
        student.showGPA();

        Employee employee = new Employee("Rubeus", "Hagrid", 50000);
        employee.showSalary();
    }
}