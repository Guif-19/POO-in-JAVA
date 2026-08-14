package Heranca;

public class Main {
    public static void main(String[] args) {

    //herança

    Dog dog = new Dog();
    Cat cat = new Cat();

    System.out.println(dog.isAlive);
    System.out.println(cat.isAlive);

    dog.eat();
    cat.eat();

    System.out.println(dog.lives);
    System.out.println(cat.lives);

    dog.speak();
    cat.speak();

    Plant plant = new Plant();
    plant.photosynthesize();

    }
}

