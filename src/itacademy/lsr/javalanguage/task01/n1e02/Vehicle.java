package itacademy.lsr.javalanguage.task01.n1e02;

public class Vehicle {
    public String name;
    public boolean state = false;
    public int speed = 0;


    public Vehicle (String newName){
        name = newName;
    }

    public void startEngine() {
        if (!state){
            System.out.println("Turing on...");
            state = true;
        }
    }

    public String displayStateName(){
        if (state){
            return "on";
        }
        else{
            return "off";
        }
    }


    public static void stop(){
        System.out.println("Vehicle stopped");
    }

    public void accelerate(int speedIncrease){
        if (state){
            System.out.println("Accelerating... ");
            speed += speedIncrease;
        }else{
            System.out.println("Cannot accelerate without turing on!");
        }

    }

    public static void main(String[] args) {

        // Call non-static methods
        Vehicle car = new Vehicle("Car");
        System.out.println(car.name + " is " + car.displayStateName());
        car.accelerate(20);
        car.startEngine();
        System.out.println(car.name + " is " + car.displayStateName());
        System.out.println("Current speed: " + car.speed);
        car.accelerate(15);
        System.out.println("Current speed: " + car.speed);

        // Call static method
        Vehicle.stop();


    }
}
