import java.util.Scanner;
class Prime
{
  public static void main(String args[])
{    
  int i,m=0,flag=0;      
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a number\n");
  int n=s.nextInt();      
  if(n==0||n==1)
  {  
     System.out.println(n+" is not prime number");      
  }
   else
   {  
   	 for(i=2;i<=n/2;i++)
	{      
    		if(n%i==0)
	{      
        	System.out.println(n+" is not prime number");      
        	flag=1;      
        	break;      
         }      
        }      
        if(flag==0)
       { 
           System.out.println(n+" is prime number");
       }
  
   }
 }
}
 
  