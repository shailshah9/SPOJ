
import static java.lang.Math.pow;
import static java.lang.System.exit;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();       
        long ab=Long.parseLong(a);
        if(ab<1 || ab>(10^18))
        {
            exit(0);
        }
        else
        {
            System.out.printf("%.0f\n",(getFactorial(ab)-ab+pow(2,ab)));
        }
        
    
    }
    public static long getFactorial(long number) {
        long factorial = 1;
        for (long i = 1; i <= number; ++i) {
            factorial *= i;
        }
        return factorial;
    }
    
}
