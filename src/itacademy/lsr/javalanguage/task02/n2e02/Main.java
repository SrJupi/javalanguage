package itacademy.lsr.javalanguage.task02.n2e02;

public class Main {
    public static void main(String[] args) {
        ThrowException te = new ThrowException();
        // As f throws a RuntimeException the compiler does not ask to handle Exception
        // leading to a error.
        te.f();
    }
}

class ThrowException {

    void f(){
        try{
            g();
        }catch(myException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            throw new RuntimeException("Method F Exception");
        }
    }

    void g() throws myException {

        throw new myException("Method G Exception!");
    }
}


class myException extends Exception{
    myException (String message){
        super(message);
    }
}