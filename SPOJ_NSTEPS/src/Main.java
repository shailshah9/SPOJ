
import java.util.Scanner;


/**
 *
 * @author Shail
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] x=new int[n][2];
        //int i=n;
        for(int i=0;i<n;i++)
        {
            x[i][0]=sc.nextInt();
            x[i][1]=sc.nextInt();
            if(x[i][0]<0 || x[i][0]>10000 || x[i][1]<0 || x[i][1]>10000)
            {
                System.exit(0);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(x[i][0]==x[i][1] || x[i][0]-x[i][1]==2)
            {
                if(x[i][0]%2==0)
                {
                    System.out.println(x[i][0]+x[i][1]);
                }
                else
                {
                    System.out.println(x[i][0]+x[i][1]-1);
                }
            }
            else
            {
                System.out.println("No Number");
            }
        }
        
    }
    
}
