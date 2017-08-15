import java.util.*;
 class day {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=0;
	 d=a%7+1;
	 switch(d)
	 {
	 case 0:
	 System.out.println("sunday\n");
	 break;
	 case 1:
     System.out.println("monday\n");
	 break;
	 case 2:
     System.out.println("tuesday\n");
	 break;
	 case 3:
     System.out.println("wednesday\n");
	 break;
	 case 4:
	 System.out.println("thursday\n");
	 break;
	 case 5:
	 System.out.println("friday\n");
	 break;
	 case 6:
	 System.out.println("saturday\n");
	 break;
	 }
	}

}
