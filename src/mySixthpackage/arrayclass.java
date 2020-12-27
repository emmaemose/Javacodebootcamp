package mySixthpackage;

public class arrayclass {

	public static void main(String[] args) {
	looping();
	arraylenght();
	foreachlooping();
	arrayrowandcolumn();
	arrayloop();
	declaring2darray();
	declaration();
	
		
	}

	public static void looping() {
	//For looping of An Array
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

		for (int i = 0; i < cars.length; i++) {

		  System.out.println(cars[i]);

		}
	}
	
	public static void arraylenght() {
	//Know the Array length
		String[] cars = {"Volvo", "Ford", "Mazda"};

		System.out.println(cars.length);
	}

	
	
	
	public static void replacearray() {

		//Replace An Array
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

	cars[0] = "Opel";

	System.out.println(cars[0]);
	}
	
	
	public static void foreachlooping() {

		//For Each Looping of an Array
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

	for (String i : cars) {

	System.out.println(i);
	}
	
}
	
	
	public static void arrayrowandcolumn() {
	
		int[][] myNumbers = { {1, 2, 3, 4}, 
				{5, 6, 7} };

		int x = myNumbers[1][2];			//[1] = row 1, [2] = column. Find the array index in row 1 of column 2, which is 7

		{
			System.out.println(x);
		}
	}	
	
	
	
	public static void arrayloop() {
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

	    for (int i = 0; i < myNumbers.length; ++i) {

	      for(int j = 0; j < myNumbers[i].length; ++j) {    //myNumbers[i].length loops each individual array 

	        System.out.println(myNumbers[i][j]);

	      }    
	     }
	}

		
	public static void declaring2darray() {
		//declaring and initializing 2D array  

		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  

		//printing 2D array  

		for(int i=0;i<3;i++){  

			for(int j=0;j<3;j++)
			{  
				System.out.print(arr[i][j]+" ");  
			}  

			System.out.println();  

	}  
}	
	
	
	public static void declaration () {
		int a[]={33,3,4,5};//declaration, instantiation and initialization  
		
			for(int i=0;i<a.length;i++)//length is the property of array  
		
			System.out.println(a[i]);  
		
			}
	
}
	

		
	
	
	
	
	
	
	


