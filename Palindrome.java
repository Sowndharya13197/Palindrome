import java.io.*;
import java.util.Scanner;
public class Palindrome 
{
    public static void main(String args[])
  {   int m,sum=0;
  Scanner s=new Scanner(System.in);
      System.out.println("enter no");
       int n=s.nextInt();
       int temp=n;
  while(n>0)
   { m=n%10;
 sum=(sum*10)+m;
   n=n/10;
  
   }System.out.println(sum);
  
  if(sum!=temp)
    {System.out.println("not palindrome");
    }
  if(sum==temp)
   {System.out.println("palindrome");
            
     }
    }}
