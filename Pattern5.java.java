import java.util.Scanner;

public class Pattern5 
{
 public static void main(String[] args) 
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter number of rows: ");
   int rows = sc.nextInt();
         int k=0;
        System.out.println("Here is your pattern....!!!");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            	System.out.print(k++ +" ");
            System.out.println(" ");
        }  
    }
}