package FinalAssignment;

import java.util.Scanner;

public class twotextmessage {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.print ("Enter 1st text message: ");
		String text1 = myObj.nextLine();
		
		System.out.print("Enter 2nd text message: ");
		String text2 = myObj.nextLine();
		
		System.out.println("Your text message is:" +text1+" "+text2);
		
		}
		
}
