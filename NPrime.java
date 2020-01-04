import java.util.Scanner;

public class NPrime
{ static boolean isprime(int n)
  { int i,factors=0;
    for(i=2;i<=n/2;i++)
      if(n%i==0)
      { factors++;
        break;
      }
    if(factors==0)
      return true;
    return false;
  }
  public static void main(String args[])
  { Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of prime numbers to be printed : ");
    int n = s.nextInt();
    if(n<=0)
    { System.out.println("Invalid!");
      System.exit(0);
    }
    System.out.print("The first "+n+" prime numbers are : ");
    for(int i=2;n>0;i++)
      if(isprime(i))
      { System.out.print(" "+i);
        n--;
      }
  }
}
  