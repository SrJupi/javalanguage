package itacademy.lsr.javalanguage.task01.n1e05;

public class Main {

    public static void main(String[] args){
        //Create cat object
        Cat cat = new Cat();

        //Use 3 run from Animal class
        System.out.println("First overload");
        cat.run();
        System.out.println("\nSecond overload");
        cat.run(5);
        System.out.println("\nThird overload");
        cat.run(3, 10);

        //Use cat run method
        System.out.println("\nOverload on child class");
        cat.run(true);

    }
}
