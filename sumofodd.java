import java.util.*;
class sumofodd
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char ch[]=str.toCharArray();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]%2==0)
            {
                continue;
            }
            else
            {
                sum=sum+ch[i];
            }
        }
        if(sum%2==0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println("1");
        }
        
    }
}
