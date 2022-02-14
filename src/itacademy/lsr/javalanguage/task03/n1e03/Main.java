package itacademy.lsr.javalanguage.task03.n1e03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Create containers
        ArrayList<String> arrayList =new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        //Create generator and populate
        Generator myTitanic = new Generator(Arrays.asList("Jack", "Rose", "Iceberg"));

        int k = 0;
        while (k <= 10){
            String tmp = myTitanic.newCharacter();
            arrayList.add(tmp);
            linkedList.add(tmp);
            hashSet.add(tmp);
            linkedHashSet.add(tmp);
            treeSet.add(tmp);
            k++;

        }

        System.out.println("Array List = " + arrayList);
        System.out.println("Linked List = " + linkedList);
        System.out.println("Hash Set = " + hashSet);
        System.out.println("Linked Hash Set = " + linkedHashSet);
        System.out.println("Tree Set = " + treeSet);

    }
}

class Generator{
    List<String> movieCharacters;
    int listSize;
    private int i = 0;
    Generator(List<String> movieCharacters){
        this.movieCharacters = movieCharacters;
        this.listSize = movieCharacters.size();
    }

    String newCharacter (){

        if(i == listSize){
            i=0;
        }
        String returnedCharacter = movieCharacters.get(i);
        i++;
        return returnedCharacter;

    }
}
