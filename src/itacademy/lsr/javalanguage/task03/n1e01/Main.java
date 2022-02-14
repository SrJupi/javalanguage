package itacademy.lsr.javalanguage.task03.n1e01;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month august = new Month("August");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("December");
        ArrayList<Month> months = new ArrayList<Month>(Arrays.asList(january, february, march, april, may, june, july, september,
                october, november, december));
        for (Month month : months) {
            System.out.print(month.name + " ");
        }
        months.add(7, august);
        System.out.println();
        for (Month month : months) {
            System.out.print(month.name + " ");
        }
    }
}

class Month {
    String name;
    Month(String name){
        this.name = name;
    }
}
