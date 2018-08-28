import java.util.Scanner;
class Reverse
{
   public static void main(String[] args)
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter any number\n");
      int n=s.nextInt();
      int rev=0,rem;
      while(n>=1)
      {
         rem=n%10;
         rev=rev*10+rem;
         n=n/10;
      }
      System.out.println("Reverse = "+rev);
     }
 }
