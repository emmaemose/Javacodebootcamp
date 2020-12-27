package FinalAssignment;

public class returnarraysum {

	public static void main(String[] args) {
	int[] array = {2,4,6};
	int sum = 0;
	for(int num: array) {
		sum = sum+num;
    }
    System.out.println("Sum of array:"+sum);
 }
}
