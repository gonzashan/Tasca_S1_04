package n1exercici3Test;

import n1exercici3.N1exercici3;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class OutOfBoundsExceptionTest {

    @Test
    @DisplayName("testing outOfBounds")
    public void checkingOutOfBound() {

        N1exercici3 test = new N1exercici3();
        int expected1 = 2, expected2 = 8, value1 = 0, value2 = 3;
        // int[] array = new int[]{2,4,6,8,10};
        Assert.assertEquals(expected1, test.outOfBounds(value1));
        Assert.assertEquals(expected2, test.outOfBounds(value2));
        // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // Assert.assertEquals(1,test.outOfBounds(5));


    }
}
