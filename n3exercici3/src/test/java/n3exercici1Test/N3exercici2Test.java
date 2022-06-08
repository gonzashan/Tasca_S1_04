package n3exercici1Test;

import n3exercici1.Dog;
import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class N3exercici2Test {

    @Test
    public void objectsAreEquals(){

        Dog fido = new Dog("Putin", 5.25);
        Dog gido = fido;
        Dog fidosClone = new Dog("Putin", 5.25);

        //Una asserció que demostri que el valor de dos objectes sencers és igual,
        // i una altra que indiqui que no ho és.
        assertThat(fido).isEqualToComparingFieldByFieldRecursively(gido);
        assertThat(fido).isNotEqualTo(fidosClone);

    }

}
