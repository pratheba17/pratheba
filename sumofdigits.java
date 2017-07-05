import java.util.*;
class sumofdigits
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int sr=s.nextInt();
        int a,sum=0,saa=0;
        while(sr!=0)
        {
            a=sr%10;
            sum=sum+a;
            sr=sr/10;
        }
        System.out.println(sum);
        int num=sum;
        while(num!=0)
        {
            int r=num%10;
            saa=saa*10+r;
            num=num/10;
        }
        if(sum==saa)
        {
            System.out.println("It is palindrome");
        }
        else
    {
        System.out.println("It is not a Palindrome");
    }
    }
}
