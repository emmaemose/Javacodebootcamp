package mySixthpackage;
import java.util.Scanner;


public class avg {

	public static void main(String[] args) {
		int numofstudents = 0;
		double totalheight = 0;
		
		try (Scanner obj = new Scanner(System.in)) {
			{
				System.out.println("How many students would you like to enter?");
				numofstudents = obj.nextInt();
			
			for (int i = 0; i<numofstudents; i++) {
				System.out.println("Enter height for each student");
				
				double height = obj.nextDouble();
				totalheight += height;
			}
			
			double averageheight = totalheight/numofstudents;
				System.out.println("The average height of students entered is: " + averageheight + "meters");
			}
		}
	}

}
