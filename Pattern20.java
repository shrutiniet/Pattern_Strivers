package Pattern;
import java.util.*;
public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		int count=2*n-2;
		for(int i=1;i<=(2*n-1);i++)
		{
			if(i<=n)
			{
				for(int j=1;j<=k;j++)
				{
					System.out.print("*");
				}
				for(int j=1;j<=count;j++)
				{
					System.out.print(" ");
				}
				
				for(int j=1;j<=k;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				//count+=2;
				for(int j=1;j<=k;j++)
				{
					System.out.print("*");
				}
				for(int j=1;j<=count;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=k;j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
			if(i<n)
			{
				k++;
				count-=2;
			}
			else
			{
				k--;
				count+=2;
			}
		}
	}

}
