package hackernk;

import java.util.Scanner;

public class prime {
	public static boolean prime(int n)
	{
		int flag=0;
		for(int k=2;k*k<=n;k++)
		{
			if(n % k != 0)
				flag=1;
			else
			{
				flag=0;
				break;
			}
				
		}
		if(flag ==1)
		   return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		System.out.println(prime(n));
		

	}

}
