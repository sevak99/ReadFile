package Exercise.Calculate.actions;

import Exercise.Calculate.Calculate;

/**
 * Created by ArmenianCodeAcademy on 3/25/2017.
 */
public class Actions1 extends Calculate {
    private int[] array;

    public Actions1(int[] array) {
        this.array = array;
    }

    @Override
    public void calc() {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(String.format("%d",sum));
    }
}
