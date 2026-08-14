package aOverriding;

public class Dog extends Animal {

    @Override
    void move(){
        System.out.println("This dog is walking");
    }
}
