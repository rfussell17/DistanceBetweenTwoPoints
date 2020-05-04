package com.rfussell;

/**
 * Class: DistanceBetweenTwoPoints.java
 * Purpose: Write a program that calculates the distance between two points.
 * @author: Robin Fussell
 * Date:  October 1, 2019
 * Version
 * */

import java.util.Scanner;
import java.lang.Math;


public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Please enter values for x1, y1: ");
        double x1 = userInput1.nextDouble();
        double y1 = userInput1.nextDouble();
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Please enter values for x2, y2: ");
        double x2 = userInput2.nextDouble();
        double y2 = userInput2.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2) * 1.0);
        System.out.printf("the distance is : %s%n", distance);
    }
}
