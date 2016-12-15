package ChapterOne; /**
 * Created by anthonyfortney on 12/5/16.
 *
 * Create a program that prompts for a quote and an author.
 * Display the quotation and author.
 */

import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.print("What is the quote? ");
        String quote = input.next();



        System.out.print("Who said it? ");
        String author = input.next();

        System.out.println(author + " says, " + "\""+quote+"\"");
        input.close();
    }
}
