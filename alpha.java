import java.util.*;
public class alpha
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
	  char ch = scan.next().charAt(0);
		
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}
