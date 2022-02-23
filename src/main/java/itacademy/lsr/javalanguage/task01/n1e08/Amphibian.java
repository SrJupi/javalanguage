package itacademy.lsr.javalanguage.task01.n1e08;

class Amphibian {
    public void move(){
        System.out.println("It appears to be moving!");
    }
    public void breathe(){
        System.out.println("Amazing wet skin to facilitate its breathing!");
    }
    public void eat(){
        System.out.println("Some flies just disappeared!");
    }
}

class Frog extends Amphibian{
    public void move(){
        System.out.println("Frog is moving!");
    }
    public void breathe(){
        System.out.println("Frog is breathing and chilling in its lake!");
    }
    public void eat(){
        System.out.println("Frog ate a lot of flies!");
    }
    public void jump() {
        System.out.println("Wow! It jumped!");
    }
}

class Test {
    public static void main(String[] args){
        Frog trevor = new Frog();
        System.out.println("Using frog class:");
        trevor.move();
        trevor.breathe();
        trevor.eat();
        trevor.jump();


        Amphibian superclassTrevor = (Amphibian) trevor;
        System.out.println("\nUsing amphibian class:");
        superclassTrevor.move();
        superclassTrevor.breathe();
        superclassTrevor.eat();

        System.out.println("Calling jump method result in a error: Cannot resolve method 'jump' in 'Amphibian'");

        // Cannot resolve method 'jump' in 'Amphibian'
        //superclassTrevor.jump();

        System.out.println("\nRESULT:\n" +
                "Generalizing frog class into amphibian class made it keep all frog methods" +
                " instead of amphibian methods.");
    }
}


