import java.util.*;
class common
{
 public static void main(String[] args)
 {
     Scanner s=new Scanner(System.in);
     int sum=0;
     int n=s.nextInt();
     int Arr1[]=new int[n];
     for(int i=0;i<n;i++)
     {
        Arr1[i]=s.nextInt();
     }
     int m=s.nextInt();
     int Arr2[]=new int[m];
     for(int i=0;i<m;i++)
     {
         Arr2[i]=s.nextInt();
     }
      int Arr3[]=new int[m];
      int k=0;
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<m;j++)
         {
             if(Arr1[i]==Arr2[j])
               {
                    Arr3[k]=Arr1[i];                   
                    k++;
               }
           }
        }
     for(int o:Arr3)
     System.out.println(o);
     for(int i=0;i<m;i++)
     {
       sum+=Arr3[i];
     }
     System.out.println(sum);
 }
}
