/** Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.  */

package work3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
        numberList();
    }

    private static void numberList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину списка целых чисел: ");
        int size = scanner.nextInt();
        int max, min;
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(-50,50));
        }
        System.out.println("Сформированный список заданной длины: \n" + list);

        max = list.get(0);
        min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
            } else if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Максимальное значение: " + max + ",\nМинимальное значение: " + min );

        double sum = list.stream().mapToInt(Integer::intValue).sum();
        double result = (Math.abs(sum))/size;
        DecimalFormat f = new DecimalFormat("##0.00");
        System.out.println("Среднее арифметическое из этого списка: " + f.format(result));
    }
}