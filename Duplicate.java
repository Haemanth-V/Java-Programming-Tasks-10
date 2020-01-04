import java.util.Scanner;

public class Duplicate
{ public static void main(String args[])
  { int n,i;
    System.out.print("Enter the number of elements of the array : ");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    if(n<=0)
    { System.out.println("Invalid!");
      System.exit(0);
    }
    int[] arr = new int[n];
    System.out.print("Enter the elements of the array : ");
    for(i=0;i<n;i++)
      arr[i] = s.nextInt();
    int flag=0,count=0;
    for(i=0;i<n;i++)
    { flag=0;
     for(int j=i+1;j<n;j++)
       if(arr[i]==arr[j])
       { if(count==0&&flag==0)
           System.out.print("Duplicate elements in the array are : ");
         flag++;
         for(int k=j; k<n-1; k++)
           arr[k]=arr[k+1];
         j--;
         n--;
       }
     if(flag!=0)
     { System.out.print(" "+arr[i]);
       count++;
     }
    }
    if(count==0)
      System.out.print("No Duplicate elements found in the array ");
  }
}