package itacademy.lsr.javalanguage.task02.n3e01;

class Base{
    Base() throws Exception {
        throw new Exception("Base exception");
    }
}

class Derived extends Base{
    Derived() throws Exception {
        super();

        //As a derived constructor always have to first call the base constructor (super),
        //there is no way of doing a try catch on the super:
//        try{
//            super();
//        }catch(Exception e){
//            System.out.println("Base exception caught!");
//        }
    }

}
