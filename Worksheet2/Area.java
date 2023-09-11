import java.util.Scanner;

public class Area
{
   public static void main(String[] args)
   {
      float len, bre, area, perimeter;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Length of Rectangle: ");
      len = s.nextFloat();
      System.out.print("Enter the Breadth of Rectangle: ");
      bre = s.nextFloat();
      
      area = len*bre;
      perimeter = (2*len) + (2*bre);
      System.out.println("\nArea = " +area);
      System.out.println("\nPerimeter = " +perimeter);
      
   }
}