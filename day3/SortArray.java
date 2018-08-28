import java.util.Scanner;
class SortArray
{
   public static void main(String[] args)
   {
       int temp;
       int ar[]={1,1,1,1,0,0,1,0};
       for(int x=0;x<=7;x++)
       {
            for(int y=x+1;y<=7;y++)
            {
            if(ar[x]>ar[y])
            {
                 temp=ar[x];
                 ar[x]=ar[y];
                 ar[y]=temp;
             }
             }
        }
        System.out.print("{");
        for(int x=0;x<=7;x++)
        {
            System.out.print(ar[x]+",");
         }
           System.out.print("}");
     }
}
