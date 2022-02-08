package itacademy.lsr.javalanguage.task01.n1e01;

public class Vehicle {

    public String name;
    public String state = "off";


    public Vehicle (String newName){
        name = newName;
    }

    public void iniciar() {
        if (state.equals("off")){
            System.out.println("Turing on...");
            state = "on";
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car");
        System.out.println(car.name + " is " + car.state);
        car.iniciar();
        System.out.println(car.name + " is " + car.state);

    }


}
