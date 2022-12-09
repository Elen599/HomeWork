/** Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
    каждая ячейка которого равна initialValue */

package org.example;

import java.util.Arrays;
import java.util.Scanner;
public class HW10 {
    public static void main(String[] args) {
        arr();
    }

    static void arr(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int len = scanner.nextInt();
        int[] array = new int[len];
        System.out.print("Введите элемент массива: ");
        int initialValue = scanner.nextInt();
        Arrays.fill(array, initialValue);
        System.out.println("Сформированный массив: ");
        System.out.println(Arrays.toString(array));
    }
}