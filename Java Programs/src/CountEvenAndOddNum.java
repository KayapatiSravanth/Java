import java.util.Scanner;

public class CountEvenAndOddNum {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num=sc.nextInt();
        int even_count=0;
        int odd_count=0;
        while(num>0){
            int rem=num%10;   //here we need to create a remainder rem = num%10 to calculate last num
            if(rem%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            num=num/10;     // here we no need to mention in to the back of num  
        }
        System.out.println("Even num count is " +even_count);
        System.out.println("odd num count is " +odd_count);
    }
}
