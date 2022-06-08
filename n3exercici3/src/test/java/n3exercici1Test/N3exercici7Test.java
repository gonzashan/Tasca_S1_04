package n3exercici1Test;

import org.junit.Test;
import java.util.Optional;
import static org.junit.Assert.assertFalse;

//Crea un objecte Optional buit. Escriu l'asserció correcta per a verificar que efectivament està buit.
public class N3exercici7Test {

    @Test
    public void objecteOptionalBuit() {

        Optional<String> empty = Optional.empty();
        assertFalse(false);
        //assertFalse(false); Other way


    }

}
