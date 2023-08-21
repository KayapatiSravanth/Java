import java.util.Scanner;

public class PalindromeString {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        String org_str=str;
        String rev=""; //FOR DOUBLE CODES WE SHOULD NOT GIVE SPACE IN BETWEEN 
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(org_str.equals(rev))
        {
            System.out.println(org_str+" The Entered string is Palindrome");
        }
        else
        {
            System.out.println(org_str+" The Entered string is not a Palindrome");
        }
    }
}
