import java.util.*;
public class add{
	public static void main(String [] args){ 		// Main method 
	Scanner sc = new Scanner(System.in);		// to take user input
	System.out.println("Enter the number");  	//  ask user to enter 1st number.
	int A = sc.nextInt();				// store the 1st number 
	System.out.println("Enter the second number"); // ask user to enter the 2nd number 
	int B = sc.nextInt();				// store the 2nd number 
	System.out.println("The addition of two number is :" + (A+B));  // print output 
	}
}
