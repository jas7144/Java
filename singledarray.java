import java.util.Scanner;
  public class singledarray
  {
    public static void main(String args[])
	{
	int a,b;
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
	for(b=0;b<a;b++)
	{
	  System.out.println(arr[b]+"  ");
	}
}	
}
	