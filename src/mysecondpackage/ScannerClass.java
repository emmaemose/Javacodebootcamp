package mysecondpackage;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
	try (Scanner myObj = new Scanner(System.in)) {   //scanner is used to get input from a user
//	
		
		
		System.out.println("1. How many moons does Jupiter have?");
		String moon = myObj.next();                 //the input is being stored in the string moon
		
		System.out.println("2. What is product of 50*8.25?");
		String product = myObj.next();
		
		System.out.println("3. Is Parasite the only Non-English Movie to win the Oscar for Best Picture?");
		String parasite = myObj.next();
		
		System.out.println("4. Which is the largest ocean in the world?");
		String ocean = myObj.next();
	}
}

}
