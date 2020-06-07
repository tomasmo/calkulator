package Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("enter first number");
        double firstNumber = Scanners.enteredNumber();
        System.out.println("enter second number");
        double secondNumber = Scanners.enteredNumber();
        System.out.println("enter operation symbol(/,*,-,+,^)");
        char operationSymbol = Scanners.enteredSymbol().charAt(0);

        getAnswer(firstNumber, secondNumber, operationSymbol);


        // System.out.println("imput operation in one line and press ENTER (use spaces between numbers and operation symbols(-,+,*,/))");
        // String enteredString1=Scanners.enteredString();
        //
        // // System.out.println(enteredString1);
        // // System.out.println(enteredString1.length());
        //
        // List<String> enteredString1AsList = new ArrayList<String>(Arrays.asList(enteredString1.split(" ")));
        //
        // System.out.println(enteredString1AsList);


    }

    private static void getAnswer(double firstNumber, double secondNumber, char operationSymbol) {
        double exponentiation= 1;
        switch (operationSymbol) {
            case '+':
                System.out.println("answer: " + (firstNumber+secondNumber));
                break;
            case '-':
                System.out.println("answer: " + (firstNumber-secondNumber));
                break;
            case '*':
                System.out.println("answer: " + (firstNumber*secondNumber));
                break;
            case '/':
                System.out.println("answer: " + (firstNumber/secondNumber));
                break;
            case '^':
                System.out.println("answer: " + Math.pow(firstNumber, secondNumber));
                break;
            default:
                System.out.println("not supported operation!");
        }
    }
}

