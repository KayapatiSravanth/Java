import java.util.Scanner;

public class FactorialOfANum {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");      //factorial is multiplication of a num and its down values factorial of 5 means 5*4*3*2*1=120
        int num=sc.nextInt();
        long Factorial=1;
        for(int i=1;i<=num;i++){
            Factorial=Factorial*i;
        }
        System.out.println("Factorial of the given num is"+Factorial);
    }
}
