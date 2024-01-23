public class Vehicle {

    protected String brand;

    protected String model;

    protected int year;



    public Vehicle(String brand, String model, int year) {

        this.brand = brand;

        this.model = model;

        this.year = year;

    }



    public void start() {

        System.out.println("The " + brand + " " + model + " is starting.");

    }

}