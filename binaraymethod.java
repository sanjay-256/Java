import java.util.Scanner;

public class binaraymethod 
{
    static void bin(int arr[], int n) 
    {
        int first = 0;
        int m = arr.length;
        int last = m - 1;
        
        while (first <= last) 
        {  
            int mid = (first + last) / 2;
            
            if (arr[mid] == n) 
            {
                System.out.println("The number is at index: " + mid);
                 break;
            } else if (arr[mid] < n) 
            {
                first = mid + 1;  
            } else 
            {
                last = mid - 1;  
            }
        }
        
        System.out.println("Number not found.");
    }
    
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be found: ");
        int n = in.nextInt();
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        bin(arr, n);
    }
}
