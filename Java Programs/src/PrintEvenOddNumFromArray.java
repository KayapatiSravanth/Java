public class PrintEvenOddNumFromArray {
    public static void main(String []args){
        int a[]={9,8,7,6,5,6};
        System.out.println("even num are..........");
        for(int i=0; i<6;i++)
        {
            if(a[i]%2==0)
                System.out.println(a[i]);
        }

        System.out.println("odd num are..........");
        for(int i=0; i<6;i++){
            if(a[i]%2!=0)
                System.out.println(a[i]);
        }
    }
}
