
import static java.lang.System.exit;
import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int t=0;
        int i=0;
        //BigInteger bi=new BigInteger("1");
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        long[] x=new long[t];
        if(t>=1 && t<=100)
        {
            for(i=0;i<t;i++)
            {
               x[i]=sc.nextInt();
               
               if(x[i]>100 || x[i]<1)
               {
                   exit(0);
               }
          //     bi = bi.multiply(BigInteger.valueOf(i));

            }
            for(i=0;i<t;i++)
            {
                getFactorial((int) x[i]);
                //  System.out.format("%.0f",x[i]);
            }
        }
        
        else
        {
             exit(0);
            
        }
        
    }
    public static void getFactorial(int number) {
        BigInteger bi=new BigInteger("1");
        for(int i=1;i<=number;i++)
        {
            bi = bi.multiply(BigInteger.valueOf(i));
            
        }
        System.out.println(bi);
        
    }
    
}