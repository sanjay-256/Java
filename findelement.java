import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class findelement 
{
 public static void main(String srgs[])
 {
    int arr[]={1,2,3,1,5,5,6,7,8,9,2,10,1,4,6,9,8};
    ArrayList<Integer> num=new ArrayList<Integer>();
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                num.add(arr[j]);
            }
        }
    }
    Collections.sort(num);
    System.out.println(num);
 }   
}
