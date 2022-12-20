/**  Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.*/


package work4;

import java.util.Collections;
import java.util.LinkedList;

public class MyReversList {
    public static void main(String[] args) {
        reversList();
    }

    private static void reversList() {
        LinkedList<String> elementList = new LinkedList<>();
        Collections.addAll(elementList, "банан", "2", "3", "4", "5", "6", "7", "8", "9", "имбирь");
        System.out.println("Список с заданными элементами: \n" + elementList);

        Collections.reverse(elementList);
        System.out.println("Перевернутый список заданных элементов: \n" + elementList);
    }
}
