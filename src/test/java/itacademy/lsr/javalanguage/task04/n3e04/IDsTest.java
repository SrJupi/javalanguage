package itacademy.lsr.javalanguage.task04.n3e04;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IDsTest {

    IDs id1;
    IDs id2;
    IDs id3;
    List <IDs> iDsList;

    @BeforeEach
    void createIDsAndArray(){
        id1 = new IDs();
        id2 = new IDs();
        id3 = new IDs();

        iDsList = new ArrayList<>();
        iDsList.add(id1);
        iDsList.add(id2);
        iDsList.add(id3);
    }

    @Test
    void arrayContainAllInInsertionOrder (){

        assertThat(iDsList).containsExactlyElementsOf(Arrays.asList(id1, id2, id3));

    }

    @Test
    void arrayContainAllInAnyOrder () {
        assertThat(iDsList).containsExactlyInAnyOrderElementsOf(Arrays.asList(id2, id3, id1));
    }

    @Test
    void arrayContainOnlyOneInstanceOfEachObject () {

        //will pass test
        assertThat(iDsList).containsOnlyOnceElementsOf(Arrays.asList(id2, id3, id1));

        //will fail because id3 was added again
        //iDsList.add(id3);
        //assertThat(iDsList).containsOnlyOnceElementsOf(Arrays.asList(id2, id3, id1));
    }

    @Test
    void arrayDoesNotContainOneObject(){
        IDs id4 = new IDs();
        assertThat(iDsList).doesNotContain(id4);
    }

}