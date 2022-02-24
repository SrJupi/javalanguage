package itacademy.lsr.javalanguage.task04.n3e06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OutOfBoundTest {

    @ParameterizedTest
    @ValueSource(ints = {10, 11, 12, 13})
    void checkOutOfBoundsWithThrownBy (int size){
        OutOfBound ob = new OutOfBound();
        assertThatThrownBy(() -> {
            ob.getItem(size);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 11, 12, 13})
    void checkOutOfBoundsWithExceptionOfType (int size){
        OutOfBound ob = new OutOfBound();
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(
                () -> ob.getItem(size));
    }

}