package ChapterOne; /**
 * Created by anthonyfortney on 12/5/16.
 *
 * Calculate gallon of paint needed to paint the ceiling of a room. Prompt for the length and width,
 * and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.
 */

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rate = 350; //1 gallon of paint covers 350 Square feet
        int area;       // get the area divide by 350 and round up to nearest whole number
        int length;
        int width;
        double gallons;

        System.out.println("What is the length of the room?");
        length = input.nextInt();

        System.out.println("What is the width of tht room?");
        width = input.nextInt();

        area = findArea(length, width);

        System.out.println("Paint to cover " + area + " square feet.");

        gallons = (double) area / rate;

        gallons = Math.ceil(gallons);

        System.out.println(gallons);





    }
    private static int findArea(int length, int width) {
       return length * width;
    }

}
