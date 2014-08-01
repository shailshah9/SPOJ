
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args)
    {
        Main a=new Main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] x = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {        
                x[i][j]=sc.nextInt();
            }
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]=a.reverse(x[i][0])+a.reverse(x[i][1]);
            System.out.println(a.reverse(result[i]));
        }
    }
    public static int reverse(int n) {
        String inputString = String.valueOf(n);
        StringBuffer stringBuffer = new StringBuffer(inputString);
        stringBuffer.reverse();
        String reversedString = stringBuffer.toString();
        int reversedInt = Integer.parseInt(reversedString);
        return reversedInt;
    }
        
}
    
