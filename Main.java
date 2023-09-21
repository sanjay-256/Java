import java.util.*;
class Main
{
    public static void main(String[] args)
    {
     int[]num={1,2,3,1,4,2,5,6,7,6,8,9,9};
     for(int i=0;i<num.length+1;i++)
     {
       for(int j=i+1;j<num.length;j++)
       {
        if(num[i]==num[j])
        {
            List<Integer>num1=new ArrayList<Integer>();
            num1.add(num[i]);
            System.out.print(num1);
        }
      }
     }
    }
}