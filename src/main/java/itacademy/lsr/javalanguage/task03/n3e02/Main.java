package itacademy.lsr.javalanguage.task03.n3e02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        long startTime1 = System.nanoTime();

        Container container = new Container();
        for (int i = 0; i < 10000; i++) {
            container.putNumber(i);
        }
        long middleTime1 = System.nanoTime();

        container.addX(4);

        long endTime1 = System.nanoTime();

        long startTime2 = System.nanoTime();

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            integerList.add(i);
        }

        long middleTime2 = System.nanoTime();

        for (int i = 0; i < integerList.size(); i++) {
            integerList.set(i, integerList.get(i) + 4);
        }


        long endTime2 = System.nanoTime();


        container.getSize();

        System.out.println("total container: " + (endTime1 - startTime1));
        System.out.println("new items container: " + (middleTime1 - startTime1));
        System.out.println("add 4 container: " + (endTime1 - middleTime1));


        System.out.println(integerList.size());
        System.out.println("total list: " + (endTime2 - startTime2));
        System.out.println("new items list: " + (middleTime2 - startTime2));
        System.out.println("add 4 list: " + (endTime2 - middleTime2));



    }
}
