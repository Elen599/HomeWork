/** Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2  */

package Work1;

import java.util.Arrays;
public class HW08 {
    public static void main(String[] args) {
        arr();
    }

    static void arr(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Заданный массив: ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6) array[i] *= 2;
        }
        System.out.println("Новый массив: ");
        System.out.println(Arrays.toString(array));
    }
}
