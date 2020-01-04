import java.util.Scanner;

public class Largest
{ public static void main(String args[])
  { Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of elements of the array : ");
    int n = s.nextInt(),max=0;
    if(n<=0)
    { System.out.println("Invalid!");
      System.exit(0);
    }
    int arr[] = new int[n];
    System.out.print("Enter the elements of the array : ");
    for(int i=0;i<n;i++)
    { arr[i] = s.nextInt();
      if(i==0)
        max=arr[0];
      else if(max<arr[i])
        max=arr[i];
    }
    System.out.print("The largest element found in the array is : "+max);
  }
}
 