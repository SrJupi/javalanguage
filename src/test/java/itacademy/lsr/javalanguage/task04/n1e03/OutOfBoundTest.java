package itacademy.lsr.javalanguage.task04.n1e03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundTest {
    @ParameterizedTest
    @ValueSource(ints = {10, 11, 12, 13})

        //Expected to return IndexOutOfBoundsException if index >= 10
    void SearchOutOfBound (int index){
        OutOfBound ob = new OutOfBound();
        assertThrows(IndexOutOfBoundsException.class,
                () -> ob.getItem(index));
    }
}