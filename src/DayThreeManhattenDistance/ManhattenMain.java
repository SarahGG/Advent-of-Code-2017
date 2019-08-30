package DayThreeManhattenDistance;

import java.util.Scanner;

/**
 * Main Class Advent of Code
 * Day Three: ManhattenDistance
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class ManhattenMain {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Advent Of Code, Day Three: Spiral Memory\n" +
                "Instructions At https://adventofcode.com/2017/day/3\n\n" +
                "Please enter a number: ");

        Integer goldenNumber = scnr.nextInt();

        RideInManhatten newRide = new RideInManhatten(goldenNumber);

        System.out.println("Steps Required: " + newRide.getManhattenDistance());
    }
}
