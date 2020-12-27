package myfifthpackage;

public class ClassNestedForLoop {

	public static void main(String[] args) {
		
//		for (int row = 0; row < 10; row++)
//		{
//			for (int col = 0; col < 10; col++)
//			{
//				System.out.print("a");
//			}
//			System.out.println();
//
//		}
//}
//}

	
//	for (int i = 0; i <6; i++)
//	{
//		for (int j = 0; j<=6; j++)
//		{
//			if (j>=i)
//			System.out.print("*");
//		}
//		
//		System.out.println("");	
//	}
	
		
// hollow square

//		for(int i=0; i<=5; i++) {
//			for(int j=0; j<=5; j++) {
//				
//				if(i==0 ||j==0||i==5||j==5) {
//					System.out.print("x");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		int[] arr = new int[5];
		
		arr [0]= 10;
        arr [1]=2;
        arr [2]=4;
        arr [3]=5;
        arr [4]=20;
		
		   	
		 
		for(int i = 0 ;i<arr.length; i++)
        {
			for (int j = 0; j<arr.length; j++)
              {
                  System.out.println("Arry elements are" + arr[j]);            
              }
            //  System.out.println("");
        }
}}