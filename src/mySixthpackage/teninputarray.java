package mySixthpackage;

import java.util.HashMap;
import java.util.Scanner;


public class teninputarray {

	public static void main(String[] args) {
		alphabetmaximumoccurencecount();
		
	}
	
	public static void alphabetmaximumoccurencecount() {
		
		 try (Scanner charCount = new Scanner(System.in)) {
			System.out.println("Enter a string:"); 
			
			//String alph = "i need the earth to unfreeze itself so that the sun and moon may play";
						 //spaces in the string alph is replaced with No space. and stored in a new string 
			
			String alph = charCount.nextLine();
			String myNewString = alph.replaceAll(" ", "");
			HashMap<Character, Integer> charCount1 = new HashMap<>();  //Hashmap to intoduce an obj and map the characters to intergers <key and value>
			
			for (Character c : myNewString.toCharArray())  //change string to character array 
			{
				if(charCount1.containsKey(c)) {               // 
					charCount1.put(c, charCount1.get(c) + 1);
				}
				else 
					{
					charCount1.put(c, 1);
					}
			}
			
			System.out.println(charCount1);
		}													
	}				
}
	


