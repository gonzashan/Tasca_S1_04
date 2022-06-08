package n1exercici1Test;

import n1exercici1.Months;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class MonthsTest {

    @Test
    @DisplayName("testing months")
    public void testingMonths() {

        Months months2check = new Months();
        String result = "Agost";
        int expected = 8;

        // Assert confirmation
        assertEquals(result, months2check.mostrarMes(expected));

    }


}

