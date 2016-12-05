/**
 * Created by anthonyfortney on 12/5/16.
 * Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet.
 * Then display the area in both square feet and square meters
 *
 * formula for area : Area = Length * width
 * Conversion for Square meters : m^2 = f^2 * 0.09290304
 */

import java.util.Scanner;

public class AreaOfRectangularRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        int width;
        int area;
        double squareMeters;



        System.out.print("What is the length of the room in feet? ");
        length = input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        width = input.nextInt();

        area = squareFeet(length, width);  //Dont like these here
        squareMeters = squareMeters(area); // same

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        System.out.println("The area is:");
        System.out.println(area + " square feet");
        System.out.println(squareMeters + "square meters"); //need to round this to the nearest thousandth




    }
    private static int squareFeet(int length, int width){
        return length * width;
    }
    private static double squareMeters(int area){
        double conversionFactor = 0.09290304;

        return area * conversionFactor;
    }


}


