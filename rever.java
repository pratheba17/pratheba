import java.util.*;
public class rever
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        String split[]=sc.split(" ");
        String result="";
        for(int i=split.length-1;i>=0;i--)
        {
            result=result+(split[i]+" ");
        }
        System.out.println(result.trim());
    }
}
