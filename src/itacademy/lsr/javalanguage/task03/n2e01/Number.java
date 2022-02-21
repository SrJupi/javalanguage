package itacademy.lsr.javalanguage.task03.n2e01;

import java.util.Random;

public class Number implements Comparable<Number>{
    Integer classNumber;

    public Number(){
        Random rand = new Random();
        this.classNumber = rand.nextInt(101);
    }

    public int getNumber(){
        return this.classNumber;
    }


    @Override
    public int compareTo(Number number) {
        if(this.getNumber() > number.getNumber()) {
            return 1;
        } else if (this.getNumber() < number.getNumber()) {
            return -1;
        } else {
            return 0;
        }
    }
}
