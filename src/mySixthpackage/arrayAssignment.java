package mySixthpackage;

import java.util.Arrays;


public class arrayAssignment {
	
	public static void main(String[] args) {
		
		int [] watsonscore = {70, 85,95, 30, 40};
		int [] bluescore = {70, 85, 65, 25, 40};
		
		
		if(Arrays.equals(watsonscore, bluescore)) 
		{
			System.out.println("Watsonscore array IS EQUAL to bluescore array");
		}
		else 
			{
			System.out.println("Watsonscore array IS NOT EQUAL to bluescore array");
			}

		
				Arrays.sort(watsonscore);
		
		System.out.println("Minimum = " + watsonscore[0]);
		System.out.println("Maximum = " + watsonscore[watsonscore.length-1]);
		
}}