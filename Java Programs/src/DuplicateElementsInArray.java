public class DuplicateElementsInArray {
    public static void main(String []args)
    {
       String arr[]={"java","helo","python","sravanth","helo"};

       boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("The duplicate element is "+arr[i]);
                    flag=true;
                }
            }
        }
       if(flag==false)
       {
        System.out.println("there are no duplicates in the elements");
       }
    }
    
}
