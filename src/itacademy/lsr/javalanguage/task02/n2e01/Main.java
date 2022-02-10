package itacademy.lsr.javalanguage.task02.n2e01;

public class Main {
    public static void main(String[] args) {
        ThrowException te = new ThrowException();
        try{
            te.f();
        }catch (Exception e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }

    }


}

class ThrowException {

    void f() throws Exception {
        try{
            g();
        }catch(myException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());;
            throw new Exception("Method F Exception");
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