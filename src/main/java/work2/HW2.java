/** Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
    который запишет эту строку в простой текстовый файл, обработайте исключения  */

package work2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;
public class HW2 {
    static Logger logger = Logger.getLogger("HW2");

    public static void main(String[] args) {
            PrintWordFile();
    }

    private static String word() {
        System.out.print("Введите слово: ");
        Scanner scanner = new Scanner(System.in);
        String wd = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(wd).append(' ');
        }
        System.out.printf(sb.toString());
        return sb.toString();
    }
    private static void PrintWordFile() {
        try (PrintWriter pw = new PrintWriter("src/main/resources/file/test.txt")) {
            String line = word();
            pw.print(line);
        }
        catch (FileNotFoundException e){
            logger.warning("Файл не найден: " + e.getMessage());
        }
    }
}