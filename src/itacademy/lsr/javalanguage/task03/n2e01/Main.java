package itacademy.lsr.javalanguage.task03.n2e01;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Number> pq = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            pq.add(new Number());
        }
        System.out.println();
        while(!pq.isEmpty()){
            System.out.print(pq.poll().getNumber() + " ");
        }

    }
}
