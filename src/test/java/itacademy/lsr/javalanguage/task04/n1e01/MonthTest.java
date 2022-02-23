package itacademy.lsr.javalanguage.task04.n1e01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MonthTest{
    @Test
    void listHave12Months (){
        Month month = new Month();
        assertEquals(12, month.getListSize());
    }

    @Test
    void listIsNull (){
        Month month = new Month();
        assertNotNull(month.getList());
    }

    @Test
    void augustIs8thMonth (){
        Month month = new Month();
        assertEquals(7, month.getIndex("August"));
    }

    @Test
    void _8thMonthIsAugust () {
        Month month = new Month();
        assertEquals("August", month.getMonth(7));
    }
}