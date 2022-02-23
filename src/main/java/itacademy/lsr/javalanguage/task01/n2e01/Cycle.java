package itacademy.lsr.javalanguage.task01.n2e01;

public class Cycle {
    int wheels;
    boolean handleBars;
    public static void ride (Cycle c){
        System.out.println("Riding wild!");
    }
}

class Unicycle extends Cycle {
    public Unicycle(){
        wheels = 1;
        handleBars = false;
    }

}

class Bicycle extends Cycle {
    public Bicycle(){
        wheels = 2;
        handleBars = true;
    }

}

class Tricycle extends Cycle {
    public Tricycle() {
        wheels = 3;
        handleBars = true;
    }
}

class Test{
    public static void main(String[] args){
        Unicycle uni = new Unicycle();
//        uni.ride(uni);
        Cycle.ride(uni);
        Bicycle bici = new Bicycle();
//        bici.ride(bici);
        Cycle.ride(bici);
        Tricycle tri = new Tricycle();
//        tri.ride(tri);
        Cycle.ride(tri);
    }
}
