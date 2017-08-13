import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int n1=0,n2=1,n3=0;
          for(int i=0;i<n;i++)
            {
              	n3=n1+n2;
              	n1=n3;
              	n2=n3;
            }
              	System.out.print(n3);

}
}
