import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);//Take input from the user
        float p, r, t, si;//Declare variables
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat();     
        System.out.println("Enter the Rate of interest : ");
        r = sc.nextFloat();     
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat();     
        sc.close();
        si = (p * r * t) / 100;//Calculate the simple interest
        System.out.println("Simple Interest is: " +si);//Print the simple interest
    }
}