import java.util.*;
public class oddEven{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int N = sc.nextInt();
	if(N %2 ==0){
		System.out.println("the number is even");
	}
	else{
		System.out.println("the number is odd");
	}
}
}
