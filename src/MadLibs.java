/**
 * Created by anthonyfortney on 12/5/16.
 *
 * Create a simple mad lib program that rompts for a noun,
 * a verb and an adjective and injects those into a story.
 */


import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String noun;
        String verb;
        String adjective;
        String adverb;

        System.out.println("Enter a noun: ");
        noun = input.next();
        System.out.println("Enter a verb: ");
        verb = input.next();
        System.out.println("Enter an adjective: ");
        adjective = input.next();
        System.out.println("Enter an adverb: ");
        adverb = input.next();

        System.out.println("Do you " + verb + " your " + adjective + noun + adverb + "? Thats's hilarious!");

    }
}
