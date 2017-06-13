import java.util.*;

class checking {
	public static void main (String[] args) {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   if(n>0)
	   {
	       System.out.println("positive");
	   }
	   else if(n==0)
	   {
	       System.out.println("Zero");
	   }
	   else{
	       System.out.println("negative");
	   }
	}
}
