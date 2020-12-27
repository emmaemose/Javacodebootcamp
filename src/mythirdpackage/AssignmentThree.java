package mythirdpackage;

import java.util.Scanner;

public class AssignmentThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//A1: NESTED IF Allow users to enter their age and print two statements  
		
//		try (Scanner sc = new Scanner(System.in)){                     //define Scanner object store user input in system.in
//		System.out.println("What is your age?");
//				
//		int age = sc.nextInt();
//		
//		
//		if (age < 18) 
//			{
//			System.out.println("You are a minor," + " and you are Not Eligible to Work");
//			}
//		
//		else if(age >= 18 && age < 60)                            //remove the else and leave only the IF statement, it would still work...
//			{
//				System.out.println("You are eligible to work," + " please fill your details and apply");
//			}
//		
//		else
//			{
//			System.out.println("You are too old to work as per the Government rules," + " please collect your pension");
//			}
//			
//		}
		
			
			
			//A2: ELSE IF  Allow the user to enter their grand total (total of six subject marks).
		
//		try (Scanner sc = new Scanner(System.in)){
//			
//			System.out.println("What is score for subject1?");         //show on 
//			int subject1 = sc.nextInt();                               //store user input
//			System.out.println("What is score for subject2?");
//			int subject2 = sc.nextInt();
//			System.out.println("What is score for subject3?");
//			int subject3 = sc.nextInt();
//			System.out.println("What is score for subject4?");
//			int subject4 = sc.nextInt();
//			System.out.println("What is score for subject5?");
//			int subject5 = sc.nextInt();
//			System.out.println("What is score for subject6?");
//			int subject6 = sc.nextInt();
								
		
//		int subject1 = 90;                     //I will use this codes if SCANNER IS DELETED....So it is the same as the one above.
//		int subject2 = 90;
//		int subject3 = 90;
//		int subject4 = 90;
//		int subject5 = 90;
//		int subject6 = 90;
		
			
//		int grandtotal = (subject1 + subject2 + subject3 + subject4 + subject5 + subject6);
//		
//		if (grandtotal >=510 && grandtotal <=600) {System.out.println("congratulations you are eligible for full scholarship");}
//		else if (grandtotal >=451 && grandtotal <=510) {System.out.println("congratulations you are eligible for 50% scholarship");}
//		else if (grandtotal >=381 && grandtotal <=450) {System.out.println("congratulations you are eligible for 10% scholarship");}
//		else if (grandtotal <= 380) {System.out.println("We are sorry! You are not eligible for scholarship");}
//		else {System.out.println("No score was entered or you never wrote the test");}
//		
//		}		
				
				
		//A3	takes three inputs from the user: one operator and 2 numbers. Based on the operator provided by the user, it performs the calculation on the numbers	
		
		//A3 I DON'T REALLY KNOW HOW TO SOLVE THIS PART
		
		try (Scanner sc = new Scanner(System.in)){
		
		System.out.println("Enter first number and second number");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int result;
		System.out.println("Select operator (+,-,*,/)");
		String operator=sc.next();
		 
			
		switch (operator) {
		
			case "+": result = number1 + number2;
			System.out.println("addition is: "+result);
			break;
		
			case "-": result = number1 - number2;
			System.out.println("subtraction is " +result);
			break;
			
			case "*": result = number1 * number2;
			System.out.println("Multiplication is " +result);
			break;
			
			
			case "/":                             //dont put the function else it won't catch the error message
			
				if (number2 == 0) 
				{
					System.out.println("This cannot be divided");
				}
			
				else 
				{	result = number1 / number2;                       //so that it execute if number2 is not 0
					System.out.println("Division is " +result);
				}
			
			break;
							
			default:                                               
				System.out.println("this operator does not exist");
	                break;
//			
		}
		}

	
		
		
		
		// A4: SWITCH CASE STATEMENT FOR VOWEL
		
//		char vowel = 'e';                                          //define the variable for vowel
//						
//		switch (vowel) {                                                //assign switch, which is like an IF statement
//				case 'a':                                              //wherever the user input a vowel, catch it and check if it corresponds
//					System.out.println("'a' is a vowel");              //print this statement is it corresponds to the case  
//					break;
//				
//				case 'e':
//					System.out.println("'e' is a vowel");
//					break;
//					
//				case 'i':
//					System.out.println("'i' is a vowel");
//					break;
//					
//				case 'o':
//					System.out.println("'o' is a vowel");
//					break;
//					
//				case 'u':
//					System.out.println("'u' a vowel");
//					break;
//				
//				default:                                                //otherwise if user enters none of the case statements then print this line of code
//					System.out.println("this is not a vowel");
//		                break;
//				}

				
	}

}
