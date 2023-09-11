import java.util.Scanner;

public class average {
    public static void main(String[]args){
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        n1= sc.nextInt();
        System.out.println("Enter the second number:");
        n2 = sc.nextInt();
        float avg = (n1+n2)/2;
        System.out.println("The average of the two numbers is :- " + avg);


    }
}
