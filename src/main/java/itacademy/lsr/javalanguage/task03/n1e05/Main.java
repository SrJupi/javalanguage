package itacademy.lsr.javalanguage.task03.n1e05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        List<Integer> originalSecondList = new ArrayList<>(Arrays.asList(5, 6 , 7, 8, 9));

        //listiterator starting from end of list

        List<Integer> secondList = new ArrayList<>(originalSecondList);
        ListIterator<Integer> reverseListIterator = firstList.listIterator(firstList.size());
        while(reverseListIterator.hasPrevious()){
            secondList.add(reverseListIterator.previous());
        }
        System.out.println("listiterator starting from end of list: " + secondList);

        //listiterator starting from start of list
        secondList = new ArrayList<>(originalSecondList);
        ListIterator<Integer> forwardListIterator = firstList.listIterator();
        // go all the way to the end
        while(forwardListIterator.hasNext()){
            forwardListIterator.next();
        }
        // to go back
        while(forwardListIterator.hasPrevious()){
            secondList.add(forwardListIterator.previous());
        }
        System.out.println("listiterator starting from start of list: " + secondList);


         //reverse for loop
        secondList = new ArrayList<>(originalSecondList);
        for (int i = firstList.size()-1; i >= 0; i--) {
            secondList.add(firstList.get(i));
        }
        System.out.println("reverse for loop: " + secondList);
        
        //using iterator and a tmp list
        secondList = new ArrayList<>(originalSecondList);
        Iterator<Integer> simpleIterator = firstList.iterator();
        int sizeFirstList = firstList.size();
        List<Integer> tmpList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));

        // go all the way to the end, saving values in tmp list
        while(simpleIterator.hasNext()){
            tmpList.set(sizeFirstList-1, simpleIterator.next());
            sizeFirstList--;
        }
        // to go back
        secondList.addAll(tmpList);
        System.out.println("using iterator and a tmp list: " + secondList);

        // reverse list

        secondList = new ArrayList<>(originalSecondList);
        Collections.reverse(firstList);
        secondList.addAll(firstList);
        System.out.println("using reverse list: " + secondList);

    }
}
