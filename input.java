import java.util.*;
public class input 
{
 public static void main(String args[])   
 {
    Scanner in=new Scanner(System.in);
    ArrayList<String>number=new ArrayList<String>();
    boolean name=true;
while(name)
{
    if(in.hasNextInt())
    {
        String numb=in.nextLine();
        number.add(numb);
    }
    else
    {
        name=false;
    }
}
    for (String j : number) {
        System.out.print(j + " ");
    }
    in.close();
 }
}
