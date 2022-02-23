package itacademy.lsr.javalanguage.task01.n2e04;

class Rodent {
    void sniff(){}
    void gnaw(){}
    void run(){}
}

class Mouse extends Rodent{
    @Override
    void sniff(){
        System.out.println("Mouse sniffed!");
    }

    @Override
    void gnaw() {
        System.out.println("Mouse gnawed some cheese!");
    }

    @Override
    void run() {
        System.out.println("Mouse ran away!");
    }
}

class Jerbu extends Rodent{
    @Override
    void sniff(){
        System.out.println("Jerbu sniffed!");
    }

    @Override
    void gnaw() {
        System.out.println("Jerbu gnawed some cheese!");
    }

    @Override
    void run() {
        System.out.println("Jerbu ran away!");
    }
}

class Hamster extends Rodent{
    @Override
    void sniff(){
        System.out.println("Hamster sniffed!");
    }

    @Override
    void gnaw() {
        System.out.println("Hamster gnawed some cheese!");
    }

    @Override
    void run() {
        System.out.println("Hamster ran away!");
    }
}

class Main{
    public static void main(String[] args){
        //create instance of subclasses
        Mouse mouse = new Mouse();
        Jerbu jerbu = new Jerbu();
        Hamster hamster = new Hamster();

        //create rodent list
        Rodent[] rodents = {mouse, jerbu, hamster};


        //calling method on superclass invoke subclass override method
        for (Rodent rat : rodents){
            rat.sniff();
            rat.gnaw();
            rat.run();
            System.out.println();
        }
    }
}
