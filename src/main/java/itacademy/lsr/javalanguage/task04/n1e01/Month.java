package itacademy.lsr.javalanguage.task04.n1e01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Month {
    List<String> months;
    public Month(){
        months = new ArrayList<>(Arrays.asList(
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"));
    }
    public List<String> getList (){
        return months;
    }

    public int getListSize(){
        return months.size();
    }

    public String getMonth (int position){
        return months.get(position);
    }

    public int getIndex (String month){
        return months.indexOf(month);
    }


}