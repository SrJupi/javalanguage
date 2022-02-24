package itacademy.lsr.javalanguage.task04.n3e07;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static itacademy.lsr.javalanguage.task04.n3e07.MyOptional.createMyOptionalEmpty;
import static org.assertj.core.api.Assertions.assertThat;

class MyOptionalTest {

    @Test
    void isOptionalEmpty () {
        Optional opt = createMyOptionalEmpty(true);

        assertThat(opt).isEmpty();

    }

    @Test
    void isOptionalNotEmpty () {
        Optional opt = createMyOptionalEmpty(false);

        assertThat(opt).isPresent();
    }

}