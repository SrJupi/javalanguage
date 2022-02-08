package itacademy.lsr.javalanguage.task01.n1e05;

class Animal {
    public void run (){
        System.out.println("Basic run!");
    }
    public void run(int currentSpeed){
        System.out.println("This animal is running at " + currentSpeed + " m/s!");
    }
    public void run (int currentSpeed, int maxSpeed){
        System.out.println("This animal is running at " + currentSpeed + " m/s.\n" +
                "It's top speed is " + maxSpeed + " m/s");
    }
}



