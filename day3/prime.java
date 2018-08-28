import java.util.Scanner;
class prime
{
   public static void main(String[] args)
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the value of n");      
int n=s.nextInt();
       int flag;
       for(int y=2;y<n;y++)
       {
         flag=0;
       for(int x=2;x<y;x++)
       {
               if(y%x==0)
               {
                  flag=1;
                  break;
                }
           
           
       }
       
       if(flag==0)
       {
            System.out.println(y);
       }
       }
   }
}
       
