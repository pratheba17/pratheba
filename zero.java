import java.util.*;
import java.io.*;
public class zero
{
    public static void main(String ar[])
    {
		 Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(a[i]+a[j]==0||(a[i]+a[j]<1&&a[i]+a[j]>-1))
			{
				System.out.println(a[i]+","+a[j]);
				
			}
		}
		}
sc.close();
    }
}
