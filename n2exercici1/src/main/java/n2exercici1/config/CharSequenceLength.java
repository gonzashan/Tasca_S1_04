package n2exercici1.config;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

import static org.hamcrest.CoreMatchers.equalTo;

public class CharSequenceLength extends FeatureMatcher  {


    public CharSequenceLength(Matcher lengthMatcher) {
        super(lengthMatcher, "La longitud configurada es de",
                "resulta que tiene");

    }
    /*  public CharSequenceLength(Matcher lengthMatcher) {
        super(lengthMatcher, "La longitud configurada es de",
                "resulta que tiene");

    }*/

    @Override
    public Integer featureValueOf(Object actual) {

        return actual.toString().length();
    }

    public static Matcher hasLength(int length) {
        return new CharSequenceLength(equalTo(length));
    }

}
