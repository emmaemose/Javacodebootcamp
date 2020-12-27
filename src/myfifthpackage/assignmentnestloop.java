package myfifthpackage;

import java.util.Scanner;

public class assignmentnestloop {

	public static void main(String[] args) {
		
		rightangletriangle();
		pascaltriangle();
//		invertedrightangle();
		pattern();
		
	}
	
//Q1 Easy Right Angle Triangle
	public static void rightangletriangle() {
	
	       for (int row = 0; row < 10; row++)
	       {
	           for (int col = 0; col < 10; col++)
	           {
	        	   if(col<=row)
	               System.out.print("@ ");
	           }
	           System.out.println();
	       }
	}

	

		
//Q2 Hard Pascal triangle
		public static void pascaltriangle() {
		
		for (int x = 0; x < 5; x++) 
		{ 
			for (int y = 0; y < 5 - x; y++) 
			{ 
			System.out.print(" "); 
			} 
		for (int y = 0; y <= x; y++) 
		{ 
			System.out.print(" @ "); 
			} 
		System.out.println(); 
		} 
	
}	

		
//Q3A: Missing..... 		
		
		
		
//Q3B: Get the row value from user and print inverted right triangle of “*”.
		public static void invertedrightangle() {
		
		System.out.println("Enter number of rows");
		try(Scanner myobj = new Scanner(System.in)){
		int inputrows = myobj.nextInt();
		
		for (int i = 0; i < inputrows; i++)
		{
			for (int j = 0; j<=inputrows; j++)
			{
				if (j>i)
				System.out.print("*");
			}
			
			System.out.println("");	
		}
		}


}		

		
//Q4: Print the following pattern. Allow user to input the row number.
		public static void pattern() { 
		
		System.out.println("Enter number of rows");
	try(Scanner myobj = new Scanner(System.in)){
	int noofrows = myobj.nextInt();
	
		for (int i=0; i<=noofrows; i++)
		{
			for(int j=1; j<=i; j++)
			{
			System.out.print(j);
			}
			System.out.println("");
			}
		}
	}
}	
		

		

	







