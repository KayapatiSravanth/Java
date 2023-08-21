import java.util.Scanner;

public class Reversestring {
    public static void main(String []args){
           //String str="ABCD";
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the string");
           String str=sc.next();
           String rev="";
           /*int len =str.length();
           for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
           }
           System.out.println(rev);*/   //this is concadination method usinf for loop
         StringBuffer sb=new StringBuffer(str);  // this is buffering method
         System.out.println(sb.reverse());
    }
}
