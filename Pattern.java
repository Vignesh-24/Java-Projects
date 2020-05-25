package zohoques;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==i)
					System.out.print(str.charAt(i));
				else if(j==n-1-i)
					System.out.print(str.charAt(n-1-i));
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
