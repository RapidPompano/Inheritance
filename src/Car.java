public class Car extends Vehicle {

    private int numDoors;



    public Car(String brand, String model, int year, int numDoors) {

        super(brand, model, year);

        this.numDoors = numDoors;

    }



    public void drive() {

        System.out.println("The " + brand + " " + model + " is driving.");

    }

}