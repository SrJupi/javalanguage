package itacademy.lsr.javalanguage.task04.n1e02;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {
    @ParameterizedTest
    @CsvSource({
            "28873434, Q",
            "03117261, W",
            "85119977, J",
            "71147988, H",
            "00922140, R",
            "26511109, K",
            "53459525, G",
            "56316918, S",
            "58044086, K",
            "56907660, W"
    })
    void MultipleTest(String dni, char expectedLetter) throws Exception {
        CalculoDNI cd = new CalculoDNI();
        assertEquals(expectedLetter, cd.getLetter(dni));
    }


}