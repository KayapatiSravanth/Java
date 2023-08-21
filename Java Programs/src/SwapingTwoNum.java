public class SwapingTwoNum {
    public static void main(String[] args){
        int a=20, b=10;
        System.out.println("Before swaping two numbers"+a+" "+b);
        /*int t=a;
        a=b;
        b=t;*/

        /*a=b+a;
        b=a-b;
        a=a-b;*/

        /*a=a*b;
        b=a/b;
        a=a/b;*/
        
        /*a=a^b;
        b=a^b;
        a=a^b;*/

        b=a+b-(a=b);
        System.out.println("After swaping two numbers"+a+" "+b);
    }
}
