package n1exercici2;

import java.util.Arrays;

public class CalculoDni {
    public final Character[] LLETERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F'
            , 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public CalculoDni() {
        super();
    }

    public Character getPreNum(Double number) {

        return getLetterFromTable((int) (number % 23));
    }

    public Character getLetterFromTable(int numberOfLetter) {

        return Arrays.asList(LLETERS).get(numberOfLetter);
    }

}
