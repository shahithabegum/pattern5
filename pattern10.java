import java.util.*;
class pattern10	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j,k;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
            for(i=1;i<=n;i++)
             {
                   for(j=1;j<=i;j++)
                    {

                                System.out.print("*");
                    }
                     System.out.println();
               }
              for(i=n;i>=1;i--)
	{
	   for(k=1;k<i;k++)
	    {
                        System.out.print("*");
	     }
                   System.out.println();
	}
       }
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
