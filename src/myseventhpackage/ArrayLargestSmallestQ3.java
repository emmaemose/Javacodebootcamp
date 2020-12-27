package myseventhpackage;
import java.util.Scanner;

public class ArrayLargestSmallestQ3 {

	public static void main(String[] args) {
		      int size;
		      
		      Scanner object = new Scanner(System.in);

		      System.out.print("Enter the size of the array: ");
		      size = object.nextInt();

		      int[] list = new int[size];

		      System.out.println("Enter " + list.length + " integers.");

		      for (int i = 0; i < list.length; i++)
		      {
		         list[i] = object.nextInt();
		      }

		      int max = list[0];
		      int min = list[0];
		      
		      for (int i = 1; i < list.length; i++)
		      {
		         if(list[i] > max)
		         {
		             max = list[i];
		         }
		         else if(list[i] < min)
		         {
		             min = list[i];
		         }          
		      }

		      System.out.println("Largest element: " + max 
		                          + " Smallest element: " + min);
		   }
		}


