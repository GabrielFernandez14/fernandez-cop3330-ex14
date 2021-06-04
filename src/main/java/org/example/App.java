/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Gabriel Fernandez
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
        // Declare constants and strings
        final double WI_TAX = 5.5;
        double tax = 0;
        String wi = "wi";
        String wisconsin = "wisconsin";

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


        // Check if the inputted state is Wisconsin, if it is, update the tax
        // and print the additional output
        if (wi.equals(state.toLowerCase()) ||
                wisconsin.equals(state.toLowerCase())) {

            tax = order * (WI_TAX / 100);
            wisconsinOutput(order, tax);
        }

        // Print the total
        System.out.println("The total is $" + df.format(order + tax) + ".");
    }

    // Prints the subtotal and the tax if the user inputted Wisconsin
    public static void wisconsinOutput(double order, double tax) {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println("The subtotal is $" + df.format(order) + ".\n"
                            + "The tax is $" + df.format(tax) + ".");
    }
}
