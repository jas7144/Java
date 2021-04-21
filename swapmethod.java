import java.util.Scanner;
public class swapmethod{

   public static void main(String[] args) {
      int a,b;
	  Scanner scan = new Scanner(System.in);
	  System.out.println("enter a:");
	  a = scan.nextInt();
	  System.out.println("enter b:");
	  b = scan.nextInt();
      System.out.println("Before swapping, a = " + a + " and b = " + b);
      swapFunction(a, b);
      System.out.println("After swapping, a = " + a + " and b is " + b);
   }

   public static void swapFunction(int a, int b) {
      System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
      
      
      int c = a;
      a = b;
      b = c;
      System.out.println("After swapping(Inside), a = " + a + " b = " + b);
   }
}