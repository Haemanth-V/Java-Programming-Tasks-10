import java.util.Scanner;

public class Fiboseries
{ static int f = -1,s = 1,t;
  static void fiboseries(int n)
  { t = f+s;
    if(t <= n)
    { System.out.print(" "+t);
      f=s;
      s=t;
      fiboseries(n);
    }
    else
      return;
  }
  public static void main(String args[])
  { int n;
    System.out.print("Enter the number upto which series is to be printed : ");
    Scanner  s = new Scanner(System.in);
    n = s.nextInt();
    if(n<0)
    { System.out.println("Invalid!");
      System.exit(0);
    }
    System.out.print("\nFibonacci Series upto "+n+" is : ");
    fiboseries(n);
  }
}