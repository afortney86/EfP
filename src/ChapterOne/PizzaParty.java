package ChapterOne; /**
 * Created by anthonyfortney on 12/5/16.
 *
 * Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas
 * and the number of slices per pizza. Ensure the number of pieces comes out even.
 * Display the number of pieces of pizza each person  should get. If there are left overs, show the number
 * of left over pieces.
 *
 */

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int people;
        int pizzas;
        int slicesPerPizza;

        System.out.print("How many people will be attending? ");
        people = input.nextInt();

        System.out.print("How many pizzas will be there? ");
        pizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        slicesPerPizza = input.nextInt();

        int totalPieces = totalPieces(pizzas, slicesPerPizza);

        System.out.println(people + " people with " + pizzas + " pizzas");

        System.out.println("You have " + totalPieces + " total slices of pizza");

        System.out.println("Each person gets " + slicesPerPerson(totalPieces, people) + " pieces of pizza");
    }
    private static int totalPieces(int pizzas, int slicesPerPizza){
        return pizzas * slicesPerPizza;
    }

    private static int slicesPerPerson(int totalPieces, int people){
        return  totalPieces / people;
    }
}
