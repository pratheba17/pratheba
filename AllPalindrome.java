import java.util.*;
public class AllPalindrome{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.nextLine();
    int count=0;
    for(int i=0;i<a.length();i++){
        for(int j=i+1;j<a.length();j++){
            String str=a.substring(i,j+1);
            StringBuffer rev=new StringBuffer(str);
            if(str.equals(new String(rev.reverse()))){
                System.out.println(str);
                count++;
            }
        }
    }
    
    }

}
