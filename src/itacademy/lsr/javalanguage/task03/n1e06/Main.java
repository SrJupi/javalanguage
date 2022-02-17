package itacademy.lsr.javalanguage.task03.n1e06;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int maxInteractions = 100000;
        List<Integer> myList1;
        List<Integer> myList2;
        ListIterator<Integer> lt;

        for (int thisInteraction = 1; thisInteraction <= maxInteractions; thisInteraction *= 10) {

            // method 1 to insert with a for loop and if statements

            long startTime1 = System.nanoTime();
            myList1 = new LinkedList<>();
            lt = myList1.listIterator();

            for (int i = 0; i < thisInteraction; i++) {
                if (myList1.size() % 2 != 0) {
                    lt.previous();
                    lt.add(i);
                } else {
                    lt.add(i);
                }
            }
            long endTime1 = System.nanoTime();

            //System.out.println("time: " + (endTime1 - startTime1));
            long time1 = endTime1 - startTime1;

            // method 2 to insert with a new listIterator for each new value

            long startTime2 = System.nanoTime();

            myList2 = new LinkedList<>();
            for (int i = 0; i < thisInteraction; i++) {
                lt = myList2.listIterator(i / 2);
                lt.add(i);
            }


            long endTime2 = System.nanoTime();
            //System.out.println("time: " + (endTime2 - startTime2));

            long time2 = endTime2 - startTime2;

            // Checking efficiency
            System.out.println("Interaction: " + thisInteraction);
            System.out.println(myList1.equals(myList2));
            System.out.println("method 1: " + time1 + " - method 2: " + time2);
            System.out.println("time 1/time2: " + (float) time1 / time2);


        }

    }
}
