/** Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.  */

package org.example;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        num();
    }

    static void num(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число а: ");
        int a = scanner.nextInt();
        if (a >= 0) System.out.println("Вы ввели число: " +a+ " - положительное");
        else System.out.println("Вы ввели число: " +a+ " - отрицательное");
    }
}
