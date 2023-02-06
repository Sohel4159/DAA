import java.util.*;
class insertion
{

  // 1.insert the smaller element in its proper place



    public static void main(String [] args)
    { Scanner s1=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s1.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=s1.nextInt();
        }
    //sorting start
        for(int i=1;i<n;i++)
        { 
            for(int j=0;j<i;j++)
            { 
             if(a[i]<a[j])
             {
                int temp=a[j];
                 a[j]=a[i];
                 a[i]=temp;
             }
               
            }
            }
        
        
  System.out.println("the sorted array is");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

      

    }
}