package mythirdpackage;

public class ControlStatement {

	public static void main(String[] args) {
//		// IF STATEMENT
//		int a = 5;
//		int b = 20;
//		int product = a*b;
//		
//		if(product == 100)
//		{System.out.println("the product is a century");
//		}
		
//		//IF ELSE STATEMENT
//		int a = 5;
//		int b = 20;
//		int product = a*b;
//		
//		if(product == 50)
//		{
//			System.out.println("the product is a century");
//		}
//		else
//		{
//			System.out.println("My product is 100");
//		}
	
		
		//IF ELSE IF STATEMENT
//				int n = 30;                                        //This line serves as an input statement
//				
//				if(n >= 90 && n <= 100)                           //This is where you specify your conditions range
//				{
//					System.out.println("Excellecent score");
//				}
//				
//				else if(n >= 70 && n <= 89)                       //This is 1st alternative to the original IF Statement
//				{
//					System.out.println("Good score");
//				}
//				
//				else if(n >= 50 && n <= 69)                      //This is 2nd alternative to the original IF Statement
//				{
//					System.out.println("average score");
//				}
//				
//				else                       				         //3rd alternative says DO THIS ACTION for things not specified in the range
//				{
//					System.out.println("low score");
//				}
				
				
				//NESTED IF STATEMENT..... I DON'T UNDERSTAND. 
				
//				int a = 30;
//				boolean age = false;
//				
//				if(a > 25) {
//					System.out.println("I am above benchmark");                    
//					if (age == true) 
//						{
//							System.out.println("Youthful blood");         //These are conditions nested in the IF statement.
//						}
//					else{
//						System.out.println("Young and free");
//						}
//				}
//				
//				else                                                      //otherwise do this code if the abv is not blah, blah...
//				{ 
//					System.out.println("Age is below benchmark");
//					if (age == true) System.out.println("Too young");
//					else System.out.println("You have time to play");
//				}
				
				
		
		//SWITCH CASE STATEMENT to check day
		
		int age = 2;
        String PlayGame;

        
        switch (age) {
            case 1:
                PlayGame = "Sometime";
                break;
            case 2:
            	PlayGame = "with Mom";
                break;
            case 3:
            	PlayGame= "with Dad";
                break;

            // match the value of week
            case 4:
            	PlayGame = "with Friends";
                break;
            case 5:
            	PlayGame = "with school Friends";
                break;
           
            default:
            	PlayGame = "Invalid Choice";
                break;
        }
        System.out.println("Play game choice  is  " + PlayGame);
    }

							
}


