import java.util.Scanner;

class addno{
   public static void main(String[] args){
     int x, y, sum;
	 Scanner a = new Scanner(System.in);
	 System.out.println("type a number:");
	 x = a.nextInt();
	 System.out.println("type another number:");
	 y = a.nextInt();
	 sum = x + y;
	 System.out.println("Sum is:"+sum);
	}
}	
	 