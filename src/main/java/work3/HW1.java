/**Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)*/

package work3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        numberList();
    }

    private static void numberList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        int size = scanner.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++){
            al.add(random.nextInt(-20,20));
        }
        System.out.println("Заданный список: \n" + al);

        int j = 0;
        do {
            if (al.get(j) % 2 == 0){
                al.remove(j);
            } else {
                j++;
            }
        } while (j < al.size()); {
            System.out.println("Итоговый писок (без четных чисел: \n" + al);
        }
    }
}