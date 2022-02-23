package itacademy.lsr.javalanguage.task04.n2e01;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static itacademy.lsr.javalanguage.task04.n2e01.NameLengthMatcher.areFullNameSameLength;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class PersonTest {
    @Test
    void isFullNameSameSize (){
        Person p1 = new Person("name", "test");
        Person p2 = new Person("abcd", "name");

        assertThat(p1, areFullNameSameLength(p2));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Gandalf", "Bilbo", "Frodo", "Sauron", "Legolas"})
    public void isNameLength7(String name) {
        Person p1 = new Person(name, "");
        assertThat(p1, firstNameLength(is(7)));
    }
    public static Matcher<Person> firstNameLength(Matcher<? super Integer> firstNameMatcher) {
        return new FeatureMatcher<Person, Integer>(firstNameMatcher,
                "a String of length that",
                "length") {
            @Override
            protected Integer featureValueOf(Person actualPerson) {
                return actualPerson.getFirstName().length();
            }
        };
    }

}