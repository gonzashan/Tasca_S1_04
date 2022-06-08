package n3exercici1Test;

import n3exercici1.Dog;
import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.Assert.*;

public class N3exercici1Test {

    @Test
    public void objectsAreEquals(){

        Dog fido = new Dog("Putin", 5.25);
        Dog fidosClone = new Dog("Putin", 5.25);
        Dog fidosClone2 = new Dog("Lola", 5.25);

        //Una asserció que demostri que el valor de dos objectes sencers és igual,
        // i una altra que indiqui que no ho és.
        assertThat(fido).isEqualToComparingFieldByFieldRecursively(fidosClone);
        assertNotEquals("Objects are not equal.", fido, fidosClone2);
    }
}
