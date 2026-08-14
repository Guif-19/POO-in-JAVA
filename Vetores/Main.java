package Vetores;

public class Main {
    public static void main(String[] args) {

        String[] frutas = {"Pera", "Uva", "Maca", "Morango"};

        int NumDeFrutas = frutas.length;

        System.out.println("Há" + NumDeFrutas + "frutas, sendo elas:");
        for (int i = 0; i < NumDeFrutas; i++) {
            System.out.print(i + ": " + frutas[i] + " ");
        }

        //Car car1 = new Car("Mustang", "Red");
        //Car car2 = new Car("Corvette", "Blue");
        //Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {new Car("Mustang", "Red"),
                new Car("Corvette", "Blue"),
                new Car("Charger", "Yellow"),};

        for (Car car : cars) {
            car.color = "black";
        }

        for (Car car : cars) {
            car.drive();
        }

    }
}
