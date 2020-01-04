import java.util.Scanner;
import java.lang.Math;

public class Armstrong
{ static int digits(long n)
  { int i=0;
    while(n!=0)
    { i++;
      n/=10;
    }
    return i;
  }
  public static void main(String args[])
  { long num;
    System.out.print("Enter a number : ");
    Scanner s = new Scanner(System.in);
    num = s.nextLong();
    int n = digits(num);
    long sum=0,t=num;
    while(t>0)
    { sum+=Math.pow(t%10,n);
      t/=10;
    }
    if(sum==num)
      System.out.print(""+num+" is an armstrong number");
    else
      System.out.print(""+num+" is not an armstrong number");
  }
}