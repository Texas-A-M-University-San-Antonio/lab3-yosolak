


import java.util.Scanner;

public class InClass4_Adeyosola_Omodaratan {

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        double side;       // length of the cubes side
        double volume;     // volume of the cube
        double surfaceArea; // surface area of the cube

        // Ask user for the side length
        System.out.print("Please enter the length of the side of the cube: ");
        side = input.nextDouble();

        // Calculate volume using Math.pow (side^3)
        volume = Math.pow(side, 3);

        // Calculate surface area: 6 * side^2
        surfaceArea = 6 * Math.pow(side, 2);

        // Display results
        System.out.println("The volume of the cube is " + volume);
        System.out.println("The surface area of the cube is " + surfaceArea);

        input.close();
    }
}
