import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/


        //Creating a Scanner object


        Scanner input = new Scanner(System.in);
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        //Prompt user to enter a weight in pounds
        System.out.println("Enter the weight");
        double weight =input.nextDouble();

        // Prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        // Convert weight to kilograms
        weight = weight * KILOGRAMS_PER_POUND;

        // Convert height to meters
        height = height * METERS_PER_INCH;

        // Compute Body Mass Index

        double bodyMassIndex = weight / Math.pow(height, 2);

        // Display result


        System.out.println("BMI is  "+bodyMassIndex);




    }
}