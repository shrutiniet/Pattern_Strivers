package Pattern;
import java.util.*;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}

}
