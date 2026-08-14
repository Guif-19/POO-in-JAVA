package Vetores;

public class Car {

    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("Voce dirige o carro " + this.model + " " + this.color);
    }

}
