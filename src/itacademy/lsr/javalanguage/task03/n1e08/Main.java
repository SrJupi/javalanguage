package itacademy.lsr.javalanguage.task03.n1e08;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // create hashmap
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("D", 2);
        linkedMap.put("E", 1);
        linkedMap.put("F", 6);
        linkedMap.put("A", 3);
        linkedMap.put("B", 5);
        linkedMap.put("C", 9);

        System.out.println("unordered linkedhashmap: " + linkedMap);


        List<Map.Entry> arrayList = new ArrayList<>();
        for(Iterator<Map.Entry<String, Integer>> it = linkedMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            arrayList.add(entry);
            it.remove();
        }

        System.out.println("unordered list: " + arrayList);


        Collections.sort(arrayList, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry p1, Map.Entry p2) {
                return (int)p1.getKey().toString().toLowerCase().charAt(0)
                        - (int)p2.getKey().toString().toLowerCase().charAt(0);
            }
        });

        System.out.println("ordered list: " + arrayList);

        for (Map.Entry entry : arrayList){
            linkedMap.put((String)entry.getKey(), (Integer)entry.getValue());

        }

        System.out.println("ordered linkedhashmap: " + linkedMap);

        //ordering with tree map
        Map<String, Integer> treeMap = new TreeMap<>(linkedMap);
        System.out.println(treeMap);
        

        




    }
}
