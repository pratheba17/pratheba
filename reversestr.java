import java.util.*;
/**
 *
 * @author User
 */
public class reversestr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    StringBuffer st=new StringBuffer(str).reverse();
    System.out.println(st);
    String ss=new String(st).replaceAll("[a,e,i,o,u]","");
    System.out.println(ss);
    }
    
    
}
