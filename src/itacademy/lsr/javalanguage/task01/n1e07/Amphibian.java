package itacademy.lsr.javalanguage.task01.n1e07;

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
    public void jump() {
        System.out.println("Wow! It jumped!");
    }
}

class Test {
    public static void main(String[] args){
        Frog trevor = new Frog();
        Amphibian superclassTrevor = (Amphibian) trevor;

        superclassTrevor.move();
        superclassTrevor.breathe();
        superclassTrevor.eat();

        System.out.println("Calling jump method result in a error: Cannot resolve method 'jump' in 'Amphibian'");

        // Cannot resolve method 'jump' in 'Amphibian'
        // superclassTrevor.jump();
    }
}


