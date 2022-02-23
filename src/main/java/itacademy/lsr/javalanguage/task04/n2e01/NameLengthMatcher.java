package itacademy.lsr.javalanguage.task04.n2e01;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class NameLengthMatcher extends TypeSafeMatcher<Person> {

    private Person expectedPerson;

    NameLengthMatcher(Person expectedPerson){
        this.expectedPerson = expectedPerson;
    }

    public static NameLengthMatcher areFullNameSameLength(Person expectedPerson){
        return new NameLengthMatcher(expectedPerson);

    }

    @Override
    protected boolean matchesSafely(Person actualPerson) {

        return actualPerson.getFirstName().length()+actualPerson.getLastName().length() ==
                expectedPerson.getFirstName().length()+expectedPerson.getLastName().length();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Expected size: ");
        description.appendValue(this.expectedPerson);
    }


}
