package itacademy.lsr.javalanguage.task01.n1e03;

public class InitWithStatic {

    public static void main(String[] args) {

        //First call loads the class and calls static block
        Initialization.printStatic();

        //Second call does not call static initialization block
        Initialization init = new Initialization();
    }
}
