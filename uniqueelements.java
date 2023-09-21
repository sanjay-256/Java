import java.util.HashSet;
import java.util.Set;

public class uniqueelements 
{
 public static void main(String args[])   
 {
        int[] array = {1, 2,10,12, 3, 3, 2,4,5,6,7,7,8, 1};
        Set<Integer> uniqueElements = new HashSet<>();
        for (int element : array) 
        {
            uniqueElements.add(element);
        }
        for (int uniqueElement : uniqueElements) 
        {
            System.out.print(uniqueElement+ " ");
        }
    }
}
