import java.util.*;
class bubble
{

  // select smallest element and put on incresing orderled index starting from 0;



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

        for(int i=0;i<n-1;i++)
    
        {
            for(int j=1;j<n;j++)
            { 
               if(a[j-1]>a[j])
               {
                int temp=a[j-1];
                a[j]=a[j-1];
                a[j-1]=temp;
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