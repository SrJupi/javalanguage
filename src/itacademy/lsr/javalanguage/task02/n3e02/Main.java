package itacademy.lsr.javalanguage.task02.n3e02;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try{
                System.out.println("Creating new FailingConstructor with ID: " + i);
                FailingConstructor fc = new FailingConstructor(i);

            } catch (Exception e) {
                System.out.println(i + ": " + e.getMessage());
            }
        }
    }
}

class FailingConstructor {
    int id;
    FailingConstructor(int id) throws Exception {
        if(id>5){
            throw new Exception ("Outside ID scope");
        }
        this.id = id;

    }
}
