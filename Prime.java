import java.util.Scanner;

public class Prime
{
 public static void main(String args[])
 { 
   System.out.print("Enter a number(integer) : ");
   Scanner s = new Scanner(System.in);
   int number = s.nextInt(),i,flag=0;
   for(i=2;i<number/2;i++)
   { if(number%i==0)
     { flag++;
       System.out.println(""+number+" is not prime (It is composite)");
       break;
     }
   }
   if(number<=1)
     System.out.println(""+number+" is neither prime nor composite");
   else if(flag==0)
     System.out.println(""+number+" is prime");
 }
} 
   