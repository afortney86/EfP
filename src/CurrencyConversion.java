/**
 * Created by anthonyfortney on 12/6/16.
 *
 * Write a program that converts currency. specifically, convert euros to U.S. dollars.
 * Prompt for the amount of money in euros you have and prompt for the current exchange rate of the euro.
 * print out the new amount in US dollars. the formula for currency conversion is.
 *
 * amount-to = amount-from * rate-from / rate to
 * ^^^^^^^^^  ^^^^^^^^^^^^  ^^^^^^^^^^   ^^^^^^^^^
 * Amount in   amount in    current       current
 * US dollars   euros       exchange rate  exchange rate
 *                          in euros        in US dollars.
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double euros;
        double euroExRate;
        double dollarExRate = 100;
        double dollars;

        System.out.println("How many euros are you exchanging?");
        euros = input.nextDouble();
        System.out.println("What is the exchange rate in euros?");
        euroExRate = input.nextDouble();


        dollars = euros * euroExRate / dollarExRate;

        System.out.println(euros + " at and exchange rate of " + euroExRate + " is " + df.format(dollars) + " U.S. dollars.");





    }
}
