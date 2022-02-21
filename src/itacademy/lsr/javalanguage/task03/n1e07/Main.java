package itacademy.lsr.javalanguage.task03.n1e07;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        {
            // create hashmap
            Map<String, Integer> hashMap = new HashMap<>();
            Random rand = new Random(0);
            int k;
            for (int i=0; i<10; i++){
                k = rand.nextInt(i+20);
                hashMap.put(Integer.toString(k+10), k+10);
            }
            System.out.println("Unordered hash map: " + hashMap);


            // create tree map from each pair hashcode from previous map
            Map<String, Integer> treeMap = new TreeMap<>(hashMap);

            System.out.println("Ordered tree map: " + treeMap);

            //create linked hashmap
            Map<String, Integer> linkedMap = new LinkedHashMap<>(treeMap);

            System.out.println("Linked hash map keeps tree map order: " + linkedMap);

            hashMap = new HashMap<>(treeMap);
            System.out.println("Unordered hash map from ordered tree map: " + hashMap);

            linkedMap = new LinkedHashMap<>(hashMap);
            System.out.println("Unordered linked hash map keeps unordered from hashmap: " + linkedMap);



        }
    }


}
