import java.util.*;
class arraysum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int x=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
        int su=arr[i]+arr[j];
        if(su==x)
        System.out.println(arr[i]+","+arr[j]);
            }
    }
}
}
