package Pattern;
import java.util.*;
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int k=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=1;j<=(2*(n-i));j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k--;
			}
			System.out.println();
		}
	}

}
