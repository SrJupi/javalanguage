package itacademy.lsr.javalanguage.task01.n2e02;

public class Cycle {
    int wheels;
    boolean handleBars;

    public int getNumWheels (Cycle c){
        return c.wheels;
    }
    public void ride (Cycle c){
        System.out.println("Number of wheels: " + getNumWheels(c));
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

class Tricycle extends Cycle{
    public Tricycle(){
        wheels = 3;
        handleBars = true;
    }
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
