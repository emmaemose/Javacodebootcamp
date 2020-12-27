package mySixthpackage;

public class student {
	
	String name;             //declare the string and int 
	int roll_no;
	

	public static void main(String[] args) {
				
		student s = new student();               //create an obj that allows us to call those declared variable and assign them a value
			s.name = "John";
			s.roll_no = 2;
			
			System.out.println("my name is " +s.name+ " with roll no "+ s.roll_no);
		}

}	

