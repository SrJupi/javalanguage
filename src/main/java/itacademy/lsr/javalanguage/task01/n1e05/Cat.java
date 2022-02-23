package itacademy.lsr.javalanguage.task01.n1e05;

class Cat extends Animal {
    public void run (boolean isStealth){
        if (isStealth){
            System.out.println("This cat is running unnoticed!");
        }else{
            System.out.println("This cat is making a lot of noise while running!");
        }
    }
}
