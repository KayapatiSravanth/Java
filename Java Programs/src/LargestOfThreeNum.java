import java.util.Scanner;

public class LargestOfThreeNum {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int A=sc.nextInt();

        System.out.println("Enter the first number");
        int B=sc.nextInt();

        System.out.println("Enter the first number");
        int C=sc.nextInt();

        /*if(A>B && A>C)       // this is if else loop general logic 
        {
            System.out.println(A+" is the gratest number");
        }
        else if(B>A && B>C)
        {
            System.out.println(B+" is the gratest number");
        }
        else
        {
            System.out.println(C+" is the gratest number");
        }*/
        int largest=A>B?A:B;     // here if a>b it will print (a):b; in the same case if a is less than b it will print a:(b) 
        largest=C>largest?C:largest;
        System.out.println(largest+" is the largest number");
        }
    }

