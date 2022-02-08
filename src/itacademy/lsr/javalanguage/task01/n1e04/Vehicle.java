package itacademy.lsr.javalanguage.task01.n1e04;

public class Vehicle {

    //Final static field common to all class
    public static final String type = "Vehicle";

    //Final fields assigned on constructor for each Instance
    public final String name;
    public final int vehicleValue;

    //Static field common to all instances
    public static float sellInterestRate;

    static {
        //initialize static field
        sellInterestRate = 0.1f;
    }
    public Vehicle (String name, int vehicleValue){
        this.name = name;
        this.vehicleValue = vehicleValue;

    }

    public static void setNewInterestRate (float newInterest){
        System.out.println("Changing interest rate to: " + newInterest);
        sellInterestRate = newInterest;
    }

    public static void main(String[] args) {
        System.out.println("Static final fields is a constant for this class");
        System.out.println("Ex: " + type);

        System.out.println("Final fields are immutable after being initialized");
        Vehicle car = new Vehicle("Car", 500);
        //car.name = "new Car"
        //cannot assign a value to final variable name;
        System.out.println("Car name cannot be changed!");

        System.out.println("Static fields are common to all class, can be assigned at initialization or with methods");
        System.out.println("Current rate: " + sellInterestRate);

        setNewInterestRate(0.2f);
        System.out.println("Current rate: " + sellInterestRate);

        Vehicle bus = new Vehicle("Bus", 1000);
        System.out.println("Bus instance current interest rate: " + bus.sellInterestRate);

    }
}