import java.util.*;
public class largest
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
	  int n=s.nextInt();
	  int t=s.nextInt();
	  int b=s.nextInt();
	  if(n>=t && n>=b)
	  {
	      System.out.println("largest is"+n);
	  }
	  if(t>=n && t>=b)
	  {
	      System.out.println("largest is"+t);
	  }
	  if(b>=t && b>=n)
	  {
	      System.out.println("largest is"+b);
	  }
    }
}
