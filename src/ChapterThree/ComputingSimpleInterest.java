package ChapterThree; /**
 * Created by anthonyfortney on 12/12/16.
 *
 * Create a program that computes simple interest. Prompt for the principal amount, the rate as a percentage,
 * and the time, and display the amount accrued (principal + interest).
 *
 * The formula for simple interest is A = P(1+R*T).
 *
 * P is the principal
 * R is the annual rate of interest.
 * T is the number of years the amount is invested
 * A is the amount at the end of the investment
 */

import java.util.Scanner;

public class ComputingSimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int principal;
        double interest;
        int years;
        double amount;

        System.out.println("Enter the principal");
        principal = input.nextInt();

        System.out.println("Enter the rate of interest");
        interest = input.nextDouble();

        System.out.println("Enter the number of years");
        years = input.nextInt();

        amount = principal * (1+convertInterest(interest) * years);

        System.out.println("After " + years + " years at " + interest + "%, the investment will be worth $" + amount + "."  );;

    }
    private static double convertInterest(double interest){
        return interest / 100;
    }
}
