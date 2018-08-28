import java.util.Scanner;
class SearchArray
{
   public static void main(String[] args)
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the value of n to be searched");      
       int n=s.nextInt();
       int flag=0;
       int ar[]={1,4,6,7,8,9,10};
       for(int x=0;x<=6;x++)
       {
            if(ar[x]==n)
            {
              flag=1;  
              break;
            }
       }
       if(flag==1)
       {
            System.out.println("Found in the array");
       }
       else
       {
           System.out.println("Not Found in the array");

       }
     }
}
 