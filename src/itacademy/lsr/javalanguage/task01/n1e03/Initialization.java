package itacademy.lsr.javalanguage.task01.n1e03;

public class Initialization {

    //Constructor
    public Initialization(){
        System.out.println("Constructor called");
    }

    // Instance block
    {
        System.out.println("Instance called");
    }

    //Static block
    static {
        System.out.println("Static block called");
    }

    public static void printStatic () {
        System.out.println("Static method called");
    }

}
