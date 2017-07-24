import java.util.*;
class commonelements
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a1[]=new int[5];
        int a2[]=new int[5];
        int count=0;
        for(int i=0;i<5;i++)
        {
            a1[i]=s.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            a2[i]=s.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(a1[i]==a2[j])
                {
                    System.out.println(a1[i]+" ");
                    count++;
                }
            }
        }
        if(count==0)
        System.out.println("-1");
    }
}
