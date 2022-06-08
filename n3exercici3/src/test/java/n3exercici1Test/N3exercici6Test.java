package n3exercici1Test;

import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.assertj.core.api.BDDAssertions.then;
import static org.assertj.core.api.Java6Assertions.assertThat;

//Crea un objecte Optional buit. Escriu l'asserció correcta per a verificar que efectivament està buit.
public class N3exercici6Test {

    String[] names = {"Mariano ", "Villarejo", "Helena"};

    @Test
    public void ArrayIndexOutOfBoundsException() {

        Throwable thrown = null;
        byte value = 3;

        try {

            thrown = catchThrowable(() -> System.out.println(names[value]));

        } catch (Exception e) {

            then((Throwable) null).isInstanceOf(ArrayIndexOutOfBoundsException.class)
                                  .hasMessageContaining(String.valueOf(value));
        }

        assertThat(thrown).isInstanceOf(ArrayIndexOutOfBoundsException.class)
                          .hasMessageContaining(String.valueOf(value));
    }


}
