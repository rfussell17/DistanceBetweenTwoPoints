package com.rfussell;

import java.util.Scanner;

/**
 * Class: CatesianCoordinateSystem.java
 *
 * Test Class: Main.java
 *
 * Purpose: Write a program that calculates the distance between two points.
 *
 *
 * ------------------------------------------
 Please enter values for x1, y1, x2, y2
 -2
 -3
 -4
 4
 the distance is : 7.28

 Process finished with exit code 0
 * ------------------------------------------
 *
 *
 * @author: Robin Fussell
 * Date:  June 18, 2020
 * Version 2.0
 */

public class CartesianCoordinateSystem {

//create method to calculate the distance

    public static double calculateDistance () {

        //create scanner to take input for the 4 points to be calculated
        //assign the inputs be used in calculation

        Scanner userInput1 = new Scanner(System.in);
        double x1 = userInput1.nextDouble();
        double y1 = userInput1.nextDouble();

        Scanner userInput2 = new Scanner(System.in);
        double x2 = userInput2.nextDouble();
        double y2 = userInput2.nextDouble();

        //calculate distance using the formula provided

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);

        //use a roundedDistance variable to store the rounded and truncated number to be returned

        double roundedDistance = Math.round(distance*100)/100d;

        return roundedDistance;
    }
}
