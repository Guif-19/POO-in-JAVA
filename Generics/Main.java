package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> fruits = new ArrayList<>();

        //fruits.add("Apple");
        //fruits.add("Orange");
        //fruits.add("Banana");

        Box<String> box = new Box<>();
        //Pode colocar outro tipo de dado no lugar de <String>

        box.setItem("banana");
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("Apple", 0.50);
        Product<String, Double> product2 = new Product<>("Ticket", 15.00);

        System.out.println("Item: " + product1.getItem() + "\nPrice: " + product1.getPrice());
    }
}
