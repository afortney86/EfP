package ChapterOne; /**
 * Created by anthonyfortney on 12/4/16.
 *
 * Create a program that prompts for an input string and
 * displays output that shows the input string and
 * the number of characters the string contains.
 */

import java.util.Scanner;
public class NumberOfCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        int stringLength;

        System.out.println("What is the input string?");
        userInput = input.next();
        stringLength = userInput.length();
        System.out.println(userInput + " has " + stringLength + " characters");

        input.close();
    }
}
