/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 14 - Tax Calculator
 */

package org.example;

// Import required libraries
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Declare Wisconsin's tax rate as a constant
        final double WI_TAX = 5.5;

        // Prompt user for input of the order amount and state
        System.out.println("What is the order amount?");
        Scanner orderIn = new Scanner(System.in);
        double order = orderIn.nextDouble();

        System.out.println("What is the state?");
        Scanner stateIn = new Scanner(System.in);
        String state = stateIn.next();

        // Limit variables called under df.format() to two decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        // Calculate the tax
        double tax = 10 * (WI_TAX / 100);

        // Check if the inputted state is Wisconsin, if it is, print the subtotal
        // and tax in addition to the total
        // If any other state, only print the total
        String msg = state.equals("WI") || state.equals("Wisconsin")
                ? "The subtotal is $" + df.format(order) + ".\n" + "The tax is $"
                + tax + ".\n" + "The total is $" + df.format((order + tax)) + "."
                : "The total is $" + df.format(order) + ".";

        // Print the output message
        System.out.println(msg);
    }
}
