package itacademy.lsr.javalanguage.task03.n1e04;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Generator movieActors = new Generator(Arrays.asList("Batman", "Robin", "Catwoman", "Penguin",
                "Riddler", "Gordon", "Alfred"));

        List<String> arrayList =new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        for (int i = 0; i < 15; i++) {
            String tmp = movieActors.newCharacter();
            arrayList.add(tmp);
            linkedList.add(tmp);
            hashSet.add(tmp);
            linkedHashSet.add(tmp);
            treeSet.add(tmp);
        }

        iteratorPrinter(arrayList);
        iteratorPrinter(linkedList);
        iteratorPrinter(hashSet);
        iteratorPrinter(linkedHashSet);
        iteratorPrinter(treeSet);
    }

    static void iteratorPrinter(Collection<?> c) {

        System.out.println(c.getClass());
        Iterator<?> it = c.iterator();
        while(it.hasNext()){
            System.out.print(it.next().toString() + " ");
        }
        System.out.println();


    }


}

