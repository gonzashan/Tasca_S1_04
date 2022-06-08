package n1exercici3;

public class N1exercici3 {

    public int outOfBounds(int value){

        int[] array = new int[]{2,4,6,8,10};
        // I'll Be Throwing the exception if 'value' is bigger than the size array
        return array[value];

    }

}
