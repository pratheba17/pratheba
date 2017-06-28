import java.io.*;
import java.util.*;

class fact
{
    public static void main(String args[])
    {
 
      int f=1,n;
      Scanner scan = new Scanner(System.in);
    
     n = scan.nextInt();
     for(int i=1; i<=n; i++)
      {
          f=f*i;
      }
	  
        System.out.print(f);
	}
}
