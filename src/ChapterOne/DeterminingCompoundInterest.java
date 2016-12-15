package ChapterOne; /**
 * Created by anthonyfortney on 12/13/16.
 *
 * Write a program to compute the value of an investment compounded over time.
 * The program should ask for the starting amount, the number of years to invest,
 * the interest rate and the number periods per year to compound.
 *
 * The formula you'll use for this is: A = P(1+r/n)^n*t
 * P = principal amount
 * R = is the annual rate of interest
 * T = the number of years the amount in invested
 * N = the number of times the interest is compounded per year
 * A = is the amount at the end of the investment
 *
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class DeterminingCompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");

        int principal;
        double interest;
        int years;
        int compounding;
        double amount;

        System.out.print("Enter the principal: ");
        principal = input.nextInt();

        System.out.print("Enter the annual rate of interest: ");
        interest = input.nextDouble();

        System.out.print("Enter the number of years the amount is invested: ");
        years = input.nextInt();

        System.out.print("Enter the number of yeas the amount is compounded: ");
        compounding = input.nextInt();

        amount = principal * Math.pow((1 + (convertInterest(interest)) / compounding), years*compounding);

        System.out.println(principal + " invested at " + interest + "% for " + years + " years compounded "
                + compounding +  " times per year is $" + df.format(amount) + ".");

    }
    private static double convertInterest(double interest){
        return interest / 100;
    }
}
