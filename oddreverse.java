import java.util.*;
class oddreverse
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String ar[]=str.split(" ");
        for(int i=0;i<ar.length;i++)
        {
            if(i%2==0)
            {
                String h=ar[i];
                StringBuffer ss=new StringBuffer(h);
                ss.reverse();
                System.out.print(ss+" ");
            }
            else
            {
                System.out.print(ar[i]+" ");
            }
        }
    }
}
