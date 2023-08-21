public class FindMinAndMaxInArray {
    public static void main(String[] args)
    {
        int a[]={20,30,40,10,50,60};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("maximum value in the given array is "+max);
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
            System.out.println("minimum value in the given array is "+min);
    }
}
