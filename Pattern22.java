package Pattern;
import java.util.*;
import java.lang.Math;
public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<(2*n-1);i++)
		{
			for(int j=0;j<(2*n-1);j++)
			{
				int top=i;
				int left=j;
				int right=(2*n-2)-j;
				int down=(2*n-2)-i;
				int val=n-Math.min(Math.min(right, left), Math.min(top, down));
				System.out.print(val);
			}
			System.out.println();
		}

	}

}
