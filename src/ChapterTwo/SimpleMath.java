package ChapterTwo; /**
 * Created by anthonyfortney on 12/5/16.
 * Write a program that prompts for two numbers.
 * Print the sum, difference, product, and quotient of those numbers.
 */

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.print("What is the first number? ");
        firstNumber = input.nextInt();
        System.out.print("What is the second number? ");
        secondNumber = input.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + addition(firstNumber, secondNumber));

        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction(firstNumber, secondNumber));

        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply(firstNumber, secondNumber));

        System.out.println(firstNumber + " / " + secondNumber + " = " + divide(firstNumber, secondNumber));

    }
    private static int addition(int num1, int num2) {
        return num1 + num2;
    }
    private static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    private static int divide(int num1, int num2) {
        return num1 / num2;
    }



}
