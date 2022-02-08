package itacademy.lsr.javalanguage.task01.n2e01;

public class Cycle {
    int wheels;
    boolean handleBars;
    public static void ride (Cycle c){
        System.out.println("Riding wild!");
    }
}

class Unicycle extends Cycle {
    int wheels = 1;
    boolean handleBars = false;
}

class Bicycle extends Cycle {
    int wheels = 2;
    boolean handleBars = true;
}

class Tricycle extends Cycle{
    int wheels = 3;
    boolean handleBars = true;
}

class Test{
    public static void main(String[] args){
        Unicycle uni = new Unicycle();
        uni.ride(uni);

        Bicycle bici = new Bicycle();
        bici.ride(bici);

        Tricycle tri = new Tricycle();
        tri.ride(tri);

    }
}
