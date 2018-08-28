import java.util.Scanner;
class Even
{
   public static void main(String[] args)
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a number");
       int n=s.nextInt();
       for(int x=1;x<=n;x++)
       {
          if(x%2==0)
          {
             System.out.println(x+" ");
           }
       }
    }
}
