import java.util.*;

public class StringPalindrome_without_StringFunctions {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        
        String s= sc.next();
        char c[] = s.toCharArray();
        
        int len = c.length;
        int lim = (len/2);
        int count = 0;

        for(int i=0; i<=lim; i++)
        {
            int j = len-i-1;
            if(c[i] != c[j])
            {
                count++;
            }
        }

        if(count == 0)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
