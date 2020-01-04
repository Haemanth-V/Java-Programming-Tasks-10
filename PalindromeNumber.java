import java.util.Scanner;

public class PalindromeNumber
{ static int reverse(int n)
  { int rev=0;
    while(n>0)
    { rev=rev*10+n%10;
      n/=10;
    }
    return rev;
  }
  public static void main(String args[])
  { int num;
    System.out.print("Enter a number : ");
    Scanner s=new Scanner(System.in);
    num=s.nextInt();
    if(num==reverse(num))
      System.out.print("\n"+num+" is a palindrome number");
    else
      System.out.print("\n"+num+" is not a palindrome number");
  }
}  
    