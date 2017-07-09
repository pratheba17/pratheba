import java.util.Scanner;

public class workingday {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       if(str.equals("sunday")|| str.equals("saturday")){
    	   System.out.println("false");
       }
       else{
    	   System.out.println("True");
       }
       sc.close();
	}
}
