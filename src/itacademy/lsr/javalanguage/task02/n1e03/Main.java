package itacademy.lsr.javalanguage.task02.n1e03;

public class Main {

    public static void main(String[] args){
        int[] myIntList = {1, 2, 3, 4, 5};

        try{
            for (int i = 0; i <= myIntList.length ; i++) {
                System.out.println(myIntList[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught. Type: " + e.getClass().getName());
        }
    }
}
