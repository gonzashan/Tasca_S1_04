package n1exercici2Test;

import n1exercici2.CalculoDni;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static java.util.Map.entry;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

@RunWith(value = Parameterized.class)
public class CalculoDniTest {

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {

        return Arrays.asList(new Object[][]{
           {09804445.0, 'M'}, {09623589.0, 'K'}, {31234567.0, 'S'},
           {78456123.0, 'H'}, {78456321.0, 'D'}, {68123456.0, 'D'},
           {68123789.0, 'C'}, {55123456.0, 'T'}, {23123456.0, 'S'},
           {11123456.0, 'N'}});
    } // end Iterable

    private Double idNumber;
    private Character exp;

    //Constructor of testing class name
    public CalculoDniTest(Double idNumber, Character exp) {
        this.idNumber = idNumber;
        this.exp = exp;
    }

    @Test
    @DisplayName("testing CalculoDni")
    public void checkDni() {

        CalculoDni calculoDni = new CalculoDni();

        /*
        Map<Double, Character> listToAssert = Map.ofEntries(
                entry(09804445.0, 'M'), entry(09623589.0, 'K'),
                entry(31234567.0, 'S'), entry(78456123.0, 'H'),
                entry(78456321.0, 'D'), entry(68123456.0, 'D'),
                entry(68123789.0, 'C'), entry(55123456.0, 'T'),
                entry(23123456.0, 'S'), entry(11123456.0, 'N'));

        for (Map.Entry<Double, Character> dniLetter : listToAssert.entrySet()) {
            //Specked results
            assertEquals(dniLetter.getValue(), calculoDni.getPreNum(dniLetter.getKey()), 0.001);
        }*/

        assertEquals(this.exp, calculoDni.getPreNum(this.idNumber), 0.001);

    }

}
