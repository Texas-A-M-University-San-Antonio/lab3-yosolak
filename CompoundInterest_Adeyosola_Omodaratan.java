/**
 * Name: [Adeyosola Omodaratan]
 * Date: [9/18]
 * Purpose: Lab 2 - Calculate Energy using Physics Equation
 * 
 * 
 */
// Step 3a
import java.util.Scanner;
public class Lab2_FirstName_LastName
{
public static void main(String[] args)
{
// Step 3b
Scanner Input=new Scanner(System.in);
// Step 4: Declare a constant for the speed of light and variables for mass and energy
final double SPEED_OF_LIGHT = 300000; 
double mass;
double energy;
// Step 5: Prompt the user to enter a mass in kg and assign the input to mass
System.out.println("enter mass");
mass=input.nextDouble();
// Step 6: Calculate the energy using E = mc^2
energy = mass * SPEED_OF_LIGHT*SPEED_OF_LIGHT;
// Step 7: Display the result using string concatenation
System.out.println("The value of energy is:" + energy);
