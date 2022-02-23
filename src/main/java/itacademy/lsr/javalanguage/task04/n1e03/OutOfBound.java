package itacademy.lsr.javalanguage.task04.n1e03;


public class OutOfBound {
    static int ARRAY_SIZE = 10;
    String[] stringArr = new String[ARRAY_SIZE];

    public String getItem (int index){
        return stringArr[index];
    }

}