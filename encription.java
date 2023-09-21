import java.util.Scanner;
import java.io.*;
public class encription {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the text: ");
        String str = in.nextLine();
        System.out.println("enter the key: ");
        int key = in.nextInt();
        char c;
        int val=0;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            val = c;
            val += key;
            if (val > 122) {
                val = val - 122 + 96;
            }
            c = (char)val;
            System.out.print(c);
        }
    }
}
