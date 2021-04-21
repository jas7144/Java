import java.util.Scanner;

public class multidarrayadd
{
   public static void main(String args[])
   {

       int row, col, i, j;
	   
       int arr[][] = new int[10][10];
	   int arr1[][] = new int[10][10];
	   int sum[][] = new int[10][10];
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter row for the array (max 10) : ");
       row = scan.nextInt();
       System.out.print("Enter column for the array (max 10) : ");
       col = scan.nextInt();

       System.out.println("Enter " +(row*col)+ " Array Elements : ");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               arr[i][j] = scan.nextInt();
           }
       }
	   System.out.println("Enter " +(row*col)+ " Array Elements : ");
	   for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               arr1[i][j] = scan.nextInt();
           }
       }
	   
       System.out.print("The First  Array is :\n");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               System.out.print(arr[i][j]+ "  ");
           }
           System.out.println();
       }
	   System.out.print("The Second Array is :\n");
	   for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               System.out.print(arr1[i][j]+ "  ");
           }
           System.out.println();
       }
	   System.out.println("sum of two number in");
	    for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
				sum[i][j]=arr[i][j]+arr1[i][j];
			}
	       System.out.println();
		 }  
		 for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
				 System.out.print(sum[i][j]+" ");
			}
	       System.out.println();
		 }  
   }
}
        