/**
 * Created by anthonyfortney on 12/4/16.
 *
 * EfP Exercise Saying hello
 *
 * Create a program that prompts for your name and prints a greeting using your name
 *
 */
import java.util.Scanner;

public class SayingHello {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name;

        System.out.println("Hello! What is your name?");
        name = input.next();
        System.out.println("Hello, " + name +"! It's nice to meet you!");

    }
}