package itacademy.lsr.javalanguage.task04.n3e02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ReferenceTest {

    @Test
    void isSameReference (){
        Reference r1 = new Reference();
        Reference r2 = r1;

        assertThat(r1).isEqualTo(r2);
    }

    @Test
    void isNotSameReference (){
        Reference r1 = new Reference();
        Reference r2 = new Reference();

        assertThat(r1).isNotEqualTo(r2);
    }

}