package n2exercici1.config;

import org.hamcrest.Description;
import org.hamcrest.StringDescription;

public abstract class BaseMatchero<T> implements Matcher<T> {

    /**
     * @see org.hamcrest.Matcher#_dont_implement_Matcher___instead_extend_BaseMatcher_()
     */
    @Override
    @Deprecated
    public final void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
        // See Matcher interface for an explanation of this method.
    }

    @Override
    public  void describeMismatch(Object item, Description description) {
        description.appendText("fuex ").appendValue(item);
    }

    @Override
    public String toString() {
        return StringDescription.toString(this);
    }
}