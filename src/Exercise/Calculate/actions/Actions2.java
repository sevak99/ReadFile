package Exercise.Calculate.actions;

import Exercise.Calculate.Calculate;

/**
 * Created by ArmenianCodeAcademy on 3/25/2017.
 */
public class Actions2 extends Calculate {
    private int[] array;

    public Actions2(int[] array) {
        this.array = array;
    }

    @Override
    public void calc() {
        int sum = 0;
//        System.out.println(sum);
        for(int i = 0; i < array.length / 2; i++) {
            sum += array[i];
//            System.out.println(sum);
        }
        for (int i = array.length / 2; i < array.length; i++) {
            sum -= array[i];
//            System.out.println(sum);
        }

        System.out.println(sum);
    }
}