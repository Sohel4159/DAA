import java.util.*;
class LinearSearch
{

  // 1.insert the smaller element in its proper place
   public int linearSearch( int a[],int x)
  {
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==x)
        return i;
    }
    return -1;

  }
 

    public static void main(String [] args)
    { Scanner s1=new Scanner(System.in);
        LinearSearch l1=new LinearSearch();
        System.out.println("Enter the size of array");
        int n=s1.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=s1.nextInt();
        }
     System.out.println("Enter the number to find")
        int x=s1.nextInt();
         
        if(l1.linearSearch(a, x)>=0)
        {
            System.out.println("the given number is present in array");
        }
        else{
            System.out.println("the given number is not present in array");
        }
   
    

      

    }
}