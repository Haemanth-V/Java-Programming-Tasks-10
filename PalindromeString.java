import java.lang.StringBuilder;
import java.util.Scanner;

public class PalindromeString
{ public static void main(String args[])
  { String str = new String();
    System.out.print("Enter the string : ");
    Scanner s = new Scanner(System.in);
    str = s.nextLine();
    StringBuilder temp = new StringBuilder(str);
    StringBuilder rev = temp.reverse();
    if(str.equalsIgnoreCase(rev.toString()))     //if(str.compareToIgnoreCase(rev.toString())==0)
      System.out.println("\nIt is a palindrome string");
    else
      System.out.println("\nIt is a not palindrome string");
  }
}
