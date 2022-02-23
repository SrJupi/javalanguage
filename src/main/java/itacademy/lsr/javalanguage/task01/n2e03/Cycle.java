package itacademy.lsr.javalanguage.task01.n2e03;

public class Cycle {
    int wheels;
    boolean handleBars;

    public int getNumWheels (Cycle c){
        return c.wheels;
    }
    public static void ride (Cycle c){
        System.out.println("Number of wheels: " + c.getNumWheels(c));
    }

}

class Unicycle extends Cycle {
    public Unicycle(){
        wheels = 1;
        handleBars = false;
    }

    void balance(){
        System.out.println("One wheel equilibrium!");
    }

}

class Bicycle extends Cycle {
    public Bicycle(){
        wheels = 2;
        handleBars = true;
    }

    void balance(){
        System.out.println("Two wheel equilibrium!");
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
        // Creating instances of each class
        Unicycle uni = new Unicycle();
        Bicycle bici = new Bicycle();
        Tricycle tri = new Tricycle();

        //Generalizing in a superclass list
        Cycle [] cyclesList = {uni, bici, tri};

        //try to invoke balance() on each cycle item
        for (Cycle c : cyclesList){

            // c.balance() -> error as balance () does not exist on superclass

            // check instanceof and cast to child class
            if (c instanceof Unicycle){
                ((Unicycle) c).balance();
            }else if(c instanceof Bicycle){
                ((Bicycle) c).balance();
            }

        }
    }
}
