import java.util.*;
class star
    {
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int sp=1;
            for(int i=n;i>=1;i--)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                for(int k=0;k<=sp;k++)
                
                System.out.print(" ");
                
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
                sp=sp+1;
            }
        }
    }
