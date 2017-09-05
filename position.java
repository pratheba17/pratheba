import java.util.*;
class position 
{
    public static void main(String[] args) 
    {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
			{
				System.out.print(a[i+1]+" ");
			}
			if(a[i]<a[i+1])
			{
				System.out.print("-1 ");
			}
		}
		System.out.print("-1"+"");

	}

}
