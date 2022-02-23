package itacademy.lsr.javalanguage.task03.n3e02;

import java.util.Arrays;

public class Container {
    int [] classArray;

    public Container(){};

    public Container(int[] intArray){
        this.classArray = intArray;
    }
    public void putNumber(int intToAdd){
        if (classArray == null) {
            classArray = new int[1];
            classArray[0] = intToAdd;
        }else{
            int [] tmpArray = new int[classArray.length + 1];
            for (int i = 0; i < classArray.length; i++) {
                tmpArray[i] = classArray[i];
            }
            tmpArray[classArray.length] = intToAdd;
            classArray = tmpArray;
        }
    }

    public void addX (int x){
        for (int i = 0; i < classArray.length; i++) {
            classArray[i] += x;
        }
    }
    public void printContainer(){
        System.out.println(Arrays.toString(classArray));
    }
    public void getSize(){
        System.out.println(classArray.length);
    }
}
