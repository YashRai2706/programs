import java.util.Scanner;
class Largestnumber
{
   public static void main(String[] args)
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter first number\n");
      int a=s.nextInt();
      System.out.println("Enter second number\n");
      int b=s.nextInt();
      System.out.println("Enter third number\n");
      int c=s.nextInt();
      int d=a>b?a:(b>c?b:c);
      System.out.println("Largest number is = "+d);
    }
}
