package itacademy.lsr.javalanguage.task02.n1e05;

public class Main {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5};
        boolean isException = true;
        int i = 10;
        while(isException){

            isException = false;

            try{
                int temp = numArray[i];
                System.out.println("index " + i + " is in the array!");
            }catch(ArrayIndexOutOfBoundsException e) {
                isException = true;
                System.out.println("index " + i + " is not in array.");
            }finally {
                i--;
            }
        }
    }
}
