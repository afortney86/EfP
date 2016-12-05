/**
 * Created by anthonyfortney on 12/5/16.
 *
 * Create a program that determines how many years you have left until retirement and the year you can retire.
 * It should prompt for your current age and the age you want to retire and display the output.
 */

import java.time.Year;
import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = Year.now().getValue();

        System.out.print("What is your current age? ");
        int currentAge = input.nextInt();

        System.out.print("At what age would your like to retire? ");
        int retireAge = input.nextInt();

        int yearsLeft = retire(retireAge, currentAge);

        System.out.println("You have " + yearsLeft + "years left until you can retire");

        System.out.println("It's " + year + ", so you can retire in " + yearToRetire(year, yearsLeft));
    }

    private static int retire(int retireAge, int currentAge) {
        return retireAge - currentAge;
    }

    private static int yearToRetire(int year, int yearsLeft) {
        return year + yearsLeft;
    }

}
