package myseventhpackage;

public class ArrayListQ2 {

	public static void main(String[] args) {
		 int numArray [] = new int[15];
		 
		 numArray[0] = 1;
		 
		 int i = 1;
		 while (i <= 14){
			 numArray[i] = i+1; i++;
			 }
		 
		 //Output the value of the tenth element of the array alpha.
		 System.out.println(numArray[9]);
		        
		 //Set the value of the fifth element of the array alpha to 35.
		 numArray[4] = 35;
		 {
		 System.out.println(numArray[4]);
		 }
		 
		 //Set the value of the ninth element of the array alpha to the sum of 
		 //the sixth and thirteenth elements of the array alpha
		 numArray[8] = numArray[5] + numArray[12];	  
		 {
		 System.out.println(numArray[8]);
		 }
	}

}
