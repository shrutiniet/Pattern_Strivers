package Pattern;
import java.util.*;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				if(j<i)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(ch+" ");
					ch--;
				}
			}
			System.out.println();
		}

	}

}
