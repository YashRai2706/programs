import java.util.Scanner;
class reverse
{
   public static void main(String[] args)
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the value of n");      
       int n=s.nextInt();
       int rem,rev=0;
       while(n>=1)
       {
           rem=n%10;
           rev=rev*10+rem;
           n=n/10;
       }
       System.out.println("Reverse is = "+rev);
   }
}
