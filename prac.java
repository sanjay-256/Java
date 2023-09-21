import java.util.ArrayList;
import java.util.Scanner;

public class prac
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
         ArrayList<Integer>number=new ArrayList<>();
         int size,a,sum1=0,sum2=0;
         System.out.print("size  ");
         size=in.nextInt();
         System.out.println("num");
        for(int i=0;i<size;i++)
        {
            int num=in.nextInt();
            number.add(num);
        }
        for(int j=0;j<size/2;j++)
        {
             a=number.get(j);
            sum1=a+sum1;
        }
        for(int k=number.size()-1;k>=size/2;k--)
        {
            int b=number.get(k);
            sum2=b+sum2;
        }
        int result=sum1+sum2;
     System.out.println(result);   
     in.close();
    }
}
