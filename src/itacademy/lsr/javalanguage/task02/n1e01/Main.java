package itacademy.lsr.javalanguage.task02.n1e01;

public class Main {

    public static void main(String[] args){


        try{
            System.out.println("Try block...");
            Exception myException = new Exception("My exception test!");
            throw myException;

        }
        catch (Exception e){
            System.out.println("Catch block...");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block...");

        }



    }


}


