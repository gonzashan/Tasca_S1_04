package n2exercici1;


import n2exercici1.config.BaseMatchero;
//import n2exercici1.config.Matcher;
import n2exercici1.config.CharSequenceLength;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.junit.Test;

//Defineix un Matcher personalitzat per a Hamcrest que proporcioni el Matcher de longitud per a un String.

public class N2exercici1Test {


    @Test
    public void test_matchesExactLengthOf_CharSequence2() {

        int lengthExpected = 8; // Mordor has 6 characters

        final Matcher<CharSequence> matcher = CharSequenceLength.hasLength(lengthExpected);

                MatcherAsserto.assertThato(new Matcherito().getCadena(), matcher);
    }





    // RIzando el rizo
    // Consultar con el interesado
    public static abstract class MatcherAsserto extends BaseMatchero {

        public static <T> void assertThato(T actual, org.hamcrest.Matcher<? super T> matcher) {
            assertThato("Mensaje de error:", actual, matcher);
        }

        @Test
        public static <T> void assertThato(String reason, T actual, Matcher<? super T> matcher) {
            if (!matcher.matches(actual)) {
                Description description = new StringDescription();
                description.appendText(reason)
                        .appendText(System.lineSeparator())
                        .appendText("Esperado: ")
                        .appendDescriptionOf(matcher)
                        .appendText(System.lineSeparator())
                        .appendText("    pero tiene ")
                        .appendValue(actual.toString().length());
                 matcher.describeMismatch(actual, description);

                throw new AssertionError(description.toString());
            }

        }

        public static void assertThato(String reason, boolean assertion) {
            if (!assertion) {
                throw new AssertionError(reason);
            }
        }

        @Override
        public boolean matches(Object actual) {
            return false;
        }

        @Override
        public void describeMismatch(Object item, Description description) {
            description.appendText("fuex ").appendValue(item);
        }


    }
}





/*
*
* EAsY WAY
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
*     @Test
    public void fellowShipOfTheRingShouldContainer7() {
        int lengthExpected = 8; // Mordor has 6 characters
        assertThat("Mordor", length(is(lengthExpected)));
    }

    public static  Matcher<String> length(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {
            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }
*/