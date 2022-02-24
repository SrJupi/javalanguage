package itacademy.lsr.javalanguage.task04.n3e05;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IDsTest {

    @Test
    void isKeyInMap(){
        IDs id1 = new IDs();
        IDs id2 = new IDs();
        IDs id3 = new IDs();

        Map <Integer, IDs> IDsMap = new HashMap<>();
        IDsMap.put(id1.getId(), id1);
        IDsMap.put(id2.getId(), id2);
        IDsMap.put(id3.getId(), id3);

        assertThat(IDsMap).containsKey(id1.getId());

    }

}