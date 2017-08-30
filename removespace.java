import java.util.*;
class removespace 
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String h[]=str.split(" ");
	str = str.trim().replaceAll("\\s+", " ");
	System.out.println(str);

	}

}
