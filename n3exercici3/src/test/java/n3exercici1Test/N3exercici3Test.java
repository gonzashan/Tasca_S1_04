package n3exercici1Test;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

public class N3exercici3Test {

    @Test
    public void arrayEquals(){
        // Una asserció que indiqui que dos arrays d'enters són idèntics.
        List<Integer> first = asList(1, 3, 4, 6, 8);
        List<Integer> third = asList(1, 3, 4, 6, 8);

        assertTrue(first.containsAll(third) && third.containsAll(first));
    }

}
