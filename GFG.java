import java.util.*;
public class GFG{
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int count=0;
		int[] num=new int[in.nextInt()];//to get the number of inputs in array
        for(int i=0;i<num.length;i++){
          num[i]=in.nextInt();
		  if(num[i]==4){
			count++;
		  }
	
		}
		System.out.println(count);
		in.close();
	}
}