package itacademy.lsr.javalanguage.task02.n1e04;

public class Main {
    public static void main(String[] args) {
        try{
            throw new NewExceptionMethod("New exception created");
        }catch (NewExceptionMethod e){
            System.out.println("Exception caught.");
            System.out.println("Class: " + e.getClass());
            System.out.println("Message: " + e.getMessage());
        }
    }
}


class NewExceptionMethod extends Exception{
    public NewExceptionMethod(String message){
        super(message);
    }
}
