import java.util.*;
class countdigit
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        while(n>0)
        {
            n=n/10;
            i++;
        }
        System.out.println(i);
    }
}
