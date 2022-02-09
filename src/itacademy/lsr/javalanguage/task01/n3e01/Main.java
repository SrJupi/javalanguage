package itacademy.lsr.javalanguage.task01.n3e01;

public class Main {
    public static void main(String[] args){
        //normal base case
        Base b = new Base();
        b.method1();

        //normal derived case
        Derived d = new Derived();
        d.method1();

        //derived upcast to base
        Base upcastObj = new Derived();
        upcastObj.method1();



    }
}

class Base{
    void method1(){
        method2();
    }
    void method2(){
        System.out.println("Base method");
    }
}

class Derived extends Base{
    @Override
    void method2() {
        System.out.println("Derived method");
    }
}



