import java.util.*;
class remove
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String ss=s.next();
		char ba[]=ss.toCharArray();
		Set<Character> s1=new LinkedHashSet<Character>();
		for( int i=0 ; i<ba.length;i++ ) 
		{
			s1.add( ba[i] );
		}
		Iterator<Character> i = s1.iterator();
		while( i.hasNext() ) 
		{
			System.out.print( i.next() );
		}
    }
}
