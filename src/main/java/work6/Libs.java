package work6;

import java.util.Scanner;

public class Libs {

    String inputStr(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    int inputInt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextInt();
    }

    double inputDbl(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextDouble();
    }
}