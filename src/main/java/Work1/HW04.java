/** Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз */

package Work1;

import java.util.Scanner;
public class HW04 {
    public static void main(String[] args) {
        amount();
    }

    static void amount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++){
            System.out.println(str);
        }
    }
}