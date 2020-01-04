import java.util.Scanner;

public class Reverse
{ public static void main(String args[])
  { Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of elements of the array : ");
    int n = s.nextInt();
    if(n<=0)
    { System.out.println("Invalid!");
      System.exit(0);
    }
    int arr[] = new int[n];
    System.out.print("Enter the elements of the array : ");
    for(int i=0;i<n;i++)
      arr[i] = s.nextInt();
    System.out.print("The elements of the array in reverse order is : ");
    for(int i=n-1;i>=0;i--)
      System.out.print(" "+arr[i]);
  }
}