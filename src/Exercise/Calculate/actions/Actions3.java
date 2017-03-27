package Exercise.Calculate.actions;

import Exercise.Calculate.Calculate;

/**
 * Created by ArmenianCodeAcademy on 3/25/2017.
 */
public class Actions3 extends Calculate {
    private int[] array;

    public Actions3(int[] array) {
        this.array = array;
    }

    @Override
    public void calc() {

        int sumEven = 0, sumOdd = 0;

        for(int i = 0; i < array.length; i += 2) {
            sumEven += array[i];
        }

        for(int i = 1; i < array.length; i += 2) {
            sumOdd += array[i];
        }

        System.out.println("Sum all even members: " + sumEven);
        System.out.println("Sum all odd members: " + sumOdd);
    }
}