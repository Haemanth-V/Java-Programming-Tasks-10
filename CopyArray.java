import java.util.Scanner;

public class CopyArray
{ public static void main(String args[])
  { int ch,n,i;
    System.out.println("\t\t\tMAIN MENU");
    System.out.println("\t\t\t*********");
    System.out.println("1. Integer array");
    System.out.println("2. Double array");
    System.out.println("3. Character array");
    System.out.print("Enter your choice : ");
    Scanner s = new Scanner(System.in);
    ch = s.nextInt();
    if(ch==1)
    { System.out.print("Enter the number of elements of the array : ");
      n = s.nextInt();
      if(n<0)
      { System.out.println("Invalid!");
        System.exit(0);
      }
      int arr[] = new int[n], newarr[]=new int[n];
      System.out.print("Enter the elements of the array : ");
      for(i=0;i<n;i++)
      { arr[i] = s.nextInt();
        newarr[i]=arr[i];
      }
      System.out.print("Elements of the new array are :");
      for(i=0;i<n;i++)
        System.out.print("  "+newarr[i]);
    }
    else if(ch==2)
    { System.out.print("Enter the number of elements of the array : ");
      n = s.nextInt();
      if(n<0)
      { System.out.println("Invalid!");
        System.exit(0);
      }
      double arr[] = new double[n], newarr[]=new double[n];
      System.out.print("Enter the elements of the array : ");
      for(i=0;i<n;i++)
      { arr[i] = s.nextDouble();
        newarr[i]=arr[i];
      }
      System.out.print("Elements of the new array are :");
      for(i=0;i<n;i++)
        System.out.print("  "+newarr[i]);
    }
    else if(ch==3)
    { s.nextLine();
      System.out.print("Enter the elements of the array : ");
      String str = s.nextLine();
      char arr[] = new char[str.length()], newarr[]=new char[str.length()];
      for(i=0;i<str.length();i++)
      { arr[i] = str.charAt(i);
        newarr[i]=arr[i];
      }
      System.out.print("Elements of the new array are : ");
      System.out.print(newarr);
    }
    else
      System.out.println("Invalid choice!");
  }
}