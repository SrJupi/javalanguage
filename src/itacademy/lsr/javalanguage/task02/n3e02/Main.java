package itacademy.lsr.javalanguage.task02.n3e02;

public class Main {
    public static void main(String[] args) {
        try{
            FailingConstructor fc = new FailingConstructor(123);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }
    }
}


class FailingConstructor {
    int id;
    FailingConstructor(int id) throws Exception {
        this.id = id;
    }
}
