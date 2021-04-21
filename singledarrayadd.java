import java.util.Scanner;
  public class singledarrayadd
  {
    public static void main(String args[])
	{
	int a,b;
	int sum = 0;
	int arr[] = new int[10];
	Scanner scan = new Scanner(System.in);
	System.out.println("enter array(MAX 10):");
	a = scan.nextInt();
	System.out.println("enter"+(a)+"array elements:");
	for(b=0;b<a;b++)
	{
	  arr[b] = scan.nextInt();
	}
	System.out.println("the array is:\n");
	for(b=0;b<arr.length;b++)
	{
	  sum = sum+arr[b];
	  
	}
	System.out.println("sum of all element of an array: "+sum);
	}	
}
	