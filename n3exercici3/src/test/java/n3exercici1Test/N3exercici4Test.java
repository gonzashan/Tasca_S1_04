package n3exercici1Test;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//Crea un arrayList contenidor de diversos tipus d'objectes (crea'ls també).
// Escriu una asserció per a verificar l'ordre dels objectes en l'ArrayList segons han estat inserits.

public class N3exercici4Test {

    @Test
    public void N3exercici4_1Test(){

        ArrayList<String> arrayList1 = new ArrayList<>(asList("one","two","three"));
        List<String> arrayList2 = asList("one", "two", "three");
        //asserció per a verificar l'ordre dels objectes en l'ArrayList segons han estat inserits
        assertEquals(arrayList1, arrayList2);

    }

    @Test
    public void N3exercici4_2Test(){

        ArrayList<String> arrayList1 = new ArrayList<>(asList("one","two","three"));
        List<String> arrayList2 = asList("two", "one", "three");
        //Ara verifica que la llista anterior conté els objectes en qualsevol ordre
        assertTrue(arrayList1.containsAll(arrayList2));

    }

    @Test
    public void N3exercici4_3Test(){

        ArrayList<String> arrayList1 = new ArrayList<>(asList("one","two","three"));
        List<String> arrayList2 = asList("two", "one");

        //Verifica que, en la llista anterior, un dels objectes s'ha afegit només una vegada.
        // Deixa un dels elements sense afegir, i verifica que la llista no conté aquest últim.

        assertThat(arrayList2)
                .containsOnlyOnce("two")
                .doesNotContain("three");
    }



}
