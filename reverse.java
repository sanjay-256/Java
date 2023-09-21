public class reverse {
    public static String reverseString(String str) {
        StringBuilder reverse = new StringBuilder();
     for(int i=str.length()-1;i>=0;i--)
     {
        reverse.append(str.charAt(i));
     }
     return reverse.toString();
    }
    
    public static void main(String[] args) {
        String original = "sanjay kumar d";
        String reversed = reverseString(original);
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
   
