package itacademy.lsr.javalanguage.task03.n3e01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int threshold = 10000;
        String [] mainArray = {"Hello", "World", "Java", "Class", "Test", "Loop"};

        long startTime1 = System.nanoTime();

        Container container = new Container();
        int i = 0;
//        System.out.println(threshold);
        while(i < threshold){
            for (String addWord : mainArray){
                container.addStringSlow(addWord);
            }
            i++;
        }
        System.out.print("Size: ");
        container.getSize();

        long endTime1 = System.nanoTime();

        long startTime2 = System.nanoTime();
        List<String> listString = new ArrayList<>();

        i = 0;
//        System.out.println(threshold);
        while(i < threshold){
            for (String addWord : mainArray){
                listString.add(addWord);
            }
            i++;
        }
        System.out.print("Size: ");
        System.out.println(listString.size());

        long endTime2 = System.nanoTime();


        long startTime3 = System.nanoTime();

        Container container2 = new Container();
        i = 0;
        while(i < threshold){
            for (String addWord : mainArray){
                container2.addStringFast(addWord);
            }
            i++;
        }
        System.out.print("Size: ");
        container.getSize();

        long endTime3 = System.nanoTime();

        System.out.println("Time Container: " + (endTime1 - startTime1));
        container.getSize();

        System.out.println("Time Array List: " + (endTime2 - startTime2));
        System.out.println(listString.size());

        System.out.println("Time Container 2: " + (endTime3 - startTime3));
        container2.getSize();

        System.out.println((float)(endTime3 - startTime3) / (endTime1 - startTime1));



    }
}
