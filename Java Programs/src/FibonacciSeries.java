public class FibonacciSeries {
    public static void main (String []args){
       int n1=0, n2=1, sum=0;         // in fibonacci series at first we will assign n1 and n2 and we will keep sum as 0 and we will print first two numbers
       System.out.print(n1+" "+n2);      //and by using first two numbers we will incriment the values
       for(int i=2;i<10;i++)            
       {
       sum=n1+n2;                         // in simple words fibonacci is adding of continues two numbers like 0+1=1,1+1=2,2+1=3,3+2=5.....
       System.out.print(" "+sum);
       n1=n2;n2=sum;
       }
    }
    }
