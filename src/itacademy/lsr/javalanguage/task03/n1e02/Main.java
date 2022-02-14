package itacademy.lsr.javalanguage.task03.n1e02;

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
        ArrayList<Month> months = new ArrayList<>(Arrays.asList(january, february, march, april, may, june, july, september,
                october, november, december));
        months.add(7, august);

        //Cast array to set
        HashSet <Month> monthsSet = new HashSet<>(months);
        for (Month month:
                monthsSet) {
            System.out.print(month.name + " ");
        }
        System.out.println();

        // try to add July again
        monthsSet.add(july);
        for (Month month:
                monthsSet) {
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
