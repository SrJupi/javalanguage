package itacademy.lsr.javalanguage.task04.n3e06;


public class OutOfBound {
    static int ARRAY_SIZE = 10;
    String[] stringArr = new String[ARRAY_SIZE];

    public String getItem (int index){
        return stringArr[index];
    }

    public int getMaxSize (){
        return ARRAY_SIZE;
    }

}