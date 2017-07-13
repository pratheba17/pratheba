import java.util.*;
public class splitadd {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int x=num, sum=0;
		while(x>0) {
			num=x;
			while(num>0) {
				sum+=num%10;
				num/=10;
			}
			x/=10;
		}
		System.out.println(sum);

	}

}
