import java.util.Scanner;

public class SumOfAllElementsInAnArray {
    public static void main(String []args){
        int a[]={5,7,8,9,3};
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("the total sum of array is "+sum);
    }
}
