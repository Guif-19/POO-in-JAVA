package Get_Set;

public class Main {
    public static void main(String[] args) {

        //Get e Set

        Car car = new Car("Charger", "Yellow", 10000);

        car.setModel("Corvette");
        car.setColor("blue");
        car.setPrice(5000);

        System.out.println(car.getModel() + " " + car.getModel() + " " + car.getPrice());

    }
}