package Pattern;
import java.util.*;
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=(2*n-i);j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}