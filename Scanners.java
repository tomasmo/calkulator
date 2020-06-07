package Calculator;

import java.util.Scanner;

public class Scanners {

    public static String enteredString() {
        Scanner scanner = new Scanner(System.in);
        String enteredString = scanner.nextLine();
        //  return enteredString;
        return enteredString;
    }

    public static double enteredNumber() {
        Scanner scanner = new Scanner(System.in);
        double enteredNumber = scanner.nextDouble();
        //  return enteredString;
        return enteredNumber;
    }

    public static String enteredSymbol() {
        Scanner scanner = new Scanner(System.in);
        String enteredSymbol = scanner.next();
        //  return enteredString;
        return enteredSymbol;
    }
}