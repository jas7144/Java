
   import java.util.Scanner;
   public class Leapyear {
      public static void main(String[] args){
         int year;
		 boolean leap = false;
         System.out.println("Enter an Year : ");
         Scanner sc = new Scanner(System.in);
         year = sc.nextInt();
	       if (year % 4 == 0) {
			   System.out.println("It is a leap year");

             if (year % 100 == 0) {
			     System.out.println("It is not a leap year");

       
                if (year % 400 == 0)
                  leap = true;
                else
                  leap = false;
              }
              else
                leap = true;
            }
            else
              leap = false;

        }
    }
