package ChapterOne; /**
 * Created by anthonyfortney on 12/6/16.
 *
 * Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items.
 * Then calculate the tax using a tax rate of 5.5%.. Print out the line items with the quantity and total, and then print out the
 * Subtotal, tax amount, and total.
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class SelfCheckout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        int price1;
        int price2;
        int price3;

        int quantity1;
        int quantity2;
        int quantity3;

        double subtotal = 0;

        double tax = .055;
        double totalTax;
        double grandTotal;

        System.out.print("Enter the price for item 1: ");
        price1 = input.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        quantity1 = input.nextInt();

         subtotal += getTotalPrice(price1, quantity1);

        System.out.print("Enter the price for item 2: ");
        price2 = input.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        quantity2 = input.nextInt();

        subtotal += getTotalPrice(price2, quantity2);

        System.out.print("Enter the price for item 3: ");
        price3 = input.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        quantity3 = input.nextInt();

        subtotal += getTotalPrice(price3, quantity3);

        System.out.println("Subtotal : $" + df.format(subtotal));

        totalTax = taxAmount(subtotal, tax);

        System.out.println("Tax: $" + totalTax);

        grandTotal = subtotal + totalTax;

        System.out.println("Total: $" + grandTotal);













    }
   private static int getTotalPrice(int price, int quantity){
       return price * quantity;
   }
   private static double taxAmount(double subtotal, double tax){
       return subtotal * tax;

   }
}
