import java.util.*;
class numeric
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char ch[]=str.toCharArray();
        boolean rs=false;
        for(int i=0;i<str.length();i++)
        {
            if(!(Character.isAlphabetic(ch[i])))
            rs=true;
        }
        System.out.println(rs);
    }
}
