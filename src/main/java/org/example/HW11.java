/** Задать одномерный массив и найти в нем минимальный и максимальный элементы  */

package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        arr();
    }


    static void arr(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int num = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(-100, 100);
        }
        int min = array[0];
        int max = array[0];
        System.out.println("Задан массив: ");
        System.out.println(Arrays.toString(array));

        for (int j : array) {
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }
}
