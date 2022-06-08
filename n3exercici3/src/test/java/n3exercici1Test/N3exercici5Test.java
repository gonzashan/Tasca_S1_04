package n3exercici1Test;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

//Crea un map i verifica que conté una de les key que li afegeix.
import static org.assertj.core.api.Java6Assertions.assertThat;

public class N3exercici5Test {

    Map<String, String> countries = new HashMap<String,String>();

    @Test
    public void assertThatCountriesMapIsSameAsExpected() {

        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("JP", "Japan");
        countries.put("IE", "Ireland");

        assertThat(countries).containsKey( "UA");
    }
}
