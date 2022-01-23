package com.Expressions;

import java.util.Scanner;

public class Example1 
{

	public static void main(String[] args)
	{
		/**
		 * 
		 * Write a java program to calculate the area of circle
		 * 
		 * Points:
		 * 
		 * 1. use variables area, radius and PI_VALUE = 3.14
		 * 
		 * 2. formula area = PI_VALUE*radius*radius
		 * 
		 * 3. print the area value
		 * 
		 * Note: use 'Scanner' class to read the values from keyboard.
		 * 
		 */
		double area = 0.0;
		final double PI_VALUE = 3.14;
		double radius ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		
		radius = scanner.nextDouble();
	
		area =  PI_VALUE*radius*radius;
		System.out.println(area);
		
		scanner.close();


	}

}
