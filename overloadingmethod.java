import java.util.Scanner;
public class overloadingmethod {

   public static void main(String[] args) {
      int a,b;
      double c,d;
	  Scanner scan = new Scanner(System.in);
	  System.out.println("enter a:");
	  a = scan.nextInt();
	  System.out.println("enter b:");
	  b = scan.nextInt();
	  System.out.println("enter c:");
	  c = scan.nextDouble();
	  System.out.println("enter d:");
	  d = scan.nextDouble();
      int result1 = minFunction(a, b);
      double result2 = minFunction(c, d);
      System.out.println("Minimum Value = " + result1);
      System.out.println("Minimum Value = " + result2);
   }
   public static int minFunction(int n1, int n2) {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
   public static double minFunction(double n1, double n2) {
     double min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
}