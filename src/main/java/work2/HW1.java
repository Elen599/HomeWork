/** Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
    (возвращает boolean значение) */

package work2;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        System.out.println(isPolindrom());
    }

    private static boolean isPolindrom() {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String strResult = s.toLowerCase().replace(" ", "");

        for (int i = 0; i < strResult.length() / 2; ++i) {
            if (strResult.charAt(i) != strResult.charAt(strResult.length() - i -1)) {
                return false;
            }
        }
        return true;
    }
}