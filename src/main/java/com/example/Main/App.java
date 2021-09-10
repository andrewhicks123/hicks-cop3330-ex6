/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Andrew Hicks
 */

package com.example.Main;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println( "What is your current age? " );
        int age = input.nextInt();
        System.out.println("At what age would you like to retire? ");
        int retire = input.nextInt();
        System.out.println("You have " + (retire-age) + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + (year + (retire-age)) + ".");


    }
}
