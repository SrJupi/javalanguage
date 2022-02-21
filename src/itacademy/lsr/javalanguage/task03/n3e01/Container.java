package itacademy.lsr.javalanguage.task03.n3e01;

import java.util.*;

public class Container {
    String [] classArray;
    int lastInserted;

    public void addStringFast(String stringToAdd){
        if (classArray == null) {
            classArray = new String[10];
            classArray[0] = stringToAdd;
            lastInserted = 0;
        }else{
            try{
                classArray[lastInserted+1] = stringToAdd;
                lastInserted += 1;
            }catch (Exception e){
                String [] tmpArray = new String[classArray.length * 2];
                for (int i = 0; i < classArray.length; i++) {
                    tmpArray[i] = classArray[i];
                }
                tmpArray[classArray.length] = stringToAdd;
                lastInserted += 1;
                classArray = tmpArray;
            }

        }
    }

    public void addStringSlow(String stringToAdd){
        if (classArray == null) {
            classArray = new String[1];
            classArray[0] = stringToAdd;
        }else{
            String [] tmpArray = new String[classArray.length + 1];
            for (int i = 0; i < classArray.length; i++) {
                tmpArray[i] = classArray[i];
            }
            tmpArray[classArray.length] = stringToAdd;
            classArray = tmpArray;
        }
    }

    public void printContainer(){
        classArray = Arrays.stream(classArray).filter(Objects::nonNull).toArray(String[]::new);
        System.out.println(Arrays.toString(classArray));
    }
    public void getSize(){
        System.out.println(classArray.length);
    }
}
