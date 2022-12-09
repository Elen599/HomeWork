/** Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/

package org.example;
import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {

        System.out.print(summa());
    }

    static boolean summa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println(sum);
        return sum > 10 && sum < 21;
    }
}