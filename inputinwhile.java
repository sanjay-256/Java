import java.util.*;
public class inputinwhile {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Boolean input=true;
        ArrayList<String> name  = new ArrayList<>();
        
        while (input) {
            System.out.println("input:      ");
            if (in.hasNext("[a-z]+")) {
                String numb=in.nextLine();
                name.add(numb);
            } else {
                input=false;
            }
        }
        System.out.println(name);
        in.close();
    }
    
}
