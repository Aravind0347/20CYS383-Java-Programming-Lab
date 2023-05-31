package com.aravind.cys;

/**
 * The ArrayExample class demonstrates the usage of an array to store and display roll numbers.
 * It creates an array of roll numbers and prints each roll number using a for loop.
 * This class provides a basic example of working with arrays in Java.
 *
 * Usage:
 * - The program creates an array of roll numbers with a specified size.
 * - It assigns roll numbers to array elements.
 * - It uses a for loop to iterate through the array and print each roll number.
 *
 * Note: This example assumes a fixed size for the array and assigns values manually.
 *
 * Dependencies:
 * - None
 *
 * @author Aravind
 * @version 0.1
 */
public class ArrayExample {
    /**
     * The main method is the entry point of the program.
     * It creates an array of roll numbers and prints each roll number using a for loop.
     *
     * @param args command line arguments
     */
    public static void main(String args[]) {
        int rollNumber[] = new int[6];

        rollNumber[0] = 21;
        rollNumber[1] = 22;
        rollNumber[2] = 23;
        rollNumber[3] = 24;
        rollNumber[4] = 25;
        rollNumber[5]=26;

        for (int i = 0; i < rollNumber.length; i++) {
            System.out.println(rollNumber[i]);
        }
    }
}
