import java.io.Console;
import java.io.IOException;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws IOException
	{
		int st = 0;//,end = 0,nm=0;
		int cnt=0;
		int flag=0;
		Scanner sc = new Scanner(System.in);
		//String s,e,n;
		//s=sc.next();
		//e=sc.next();
		//n=sc.next();
                st=sc.nextInt();
		int[][] x=new int[st][2];
		for(int i=0;i<st;i++)
                {
                    /*try
                    {
			st=Integer.parseInt(s);
		
			end=Integer.parseInt(e);
			nm=Integer.parseInt(n);
                    }  
                    catch(Exception InputMismatchException)
                    {
			flag=9;
                    }*/
                    for(int j=0;j<2;j++)
                    {        
                        x[i][j]=sc.nextInt();
                    }
                    
                
		if(x[i][0]<2 || x[i][1]>2147483647 || x[i][0]=>x[i][1] || x[i][1]-x[i][0]>1000000 )
                {
                   // flag=9;
                    System.exit(0);
                }
		
		//if(flag==9)
		//{
			//System.out.println("Invalid Input");
		//	System.exit(0);
				
		//}
		
		//int i;
                for(i=0;i<st;i++)
                {
                    for(int j=x[i][0];i<x[i][1];i++)
                    {
			//if(i==1)
			//	i=i+1;
			
			flag=1;
			for(int xx=2;xx<j;xx++)
			{
				if(j%xx==0)
				{
					flag=0;
					break;
					
				}
				else
				{
					flag=1;
				}
				
			}
			if(cnt!=nm)
			{
				if(flag==1)
				{
					
					cnt++;
				}
			}
			else
			{
				break;
				
			}
			
		}
		if(i==end)
		{
			System.out.println("No prime number is present at this index");
		}
		else
		{
			System.out.println(--i);
		}
		
		
	}

}
