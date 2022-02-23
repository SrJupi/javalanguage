package itacademy.lsr.javalanguage.task01.n1e03;

public class InitWithInstance {

    public static void main(String[] args) {

        //First call loads the class and call static block
        Initialization init = new Initialization();

        //Second call does not call static initialization block
        Initialization.printStatic();


    }
}
