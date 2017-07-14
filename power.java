import java.util.*;
class power
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=1,c=0,i=0,b=0;
		int arr[]=new int[10];
		if(n>9)
		{
		while(n>0){
			c=n%10;
			n=n/10;
			arr[i]=c;
		    i++;
		}
		
		for(int j=0;j<i;j++){
			a=1;
			for(int k=0;k<i;k++){
				a=a*arr[j];
			}
			b=b+a;
		}
		System.out.println(b);
		}
		else{
		    System.out.println("Invalid Input");
		}
    }
}
