import java.util.Scanner;
class armstrong
{
   public static void main(String[] args)
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the value of n");      
       int n=s.nextInt();
       int d,sum=0;
       int t=n;
       while(n>=1)
       {
           d=n%10;
           sum=sum+(d*d*d);
           n=n/10;
       }
       if(sum==t)
       {
           System.out.println("Armstrong Number");
        }
        else
        {
           System.out.println("Not Armstrong Number");
        }
      }
}
