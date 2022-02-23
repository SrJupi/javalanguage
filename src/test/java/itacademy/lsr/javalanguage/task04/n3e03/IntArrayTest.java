package itacademy.lsr.javalanguage.task04.n3e03;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class IntArrayTest {

    @Test
    void arraysAreEqual (){

        IntArray ia = new IntArray();
        assertThat(ia.a).containsExactly(ia.b);
    }

}