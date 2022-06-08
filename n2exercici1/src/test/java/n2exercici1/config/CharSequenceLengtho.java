package n2exercici1.config;

import org.hamcrest.FeatureMatcher;

public class CharSequenceLengtho extends FeatureMatcher {

    public CharSequenceLengtho(Matcher lengthMatcher) {
        super(lengthMatcher, "La longitud configurada es de",
                "resulta que tiene");

    }

    @Override
    protected Object featureValueOf(Object actual) {
        return null;
    }
}
