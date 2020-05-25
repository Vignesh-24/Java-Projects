package hackernk;

import java.util.Scanner;

public class wrapper {
	static int count =0;
	public static void count(int n,int k)
	{
		int i=0,j=0;
		while(n > 0)
		{
			if(n-k < 0)
			{
				i=i+n;
				break;
			}
			n=n-k;
			i++;
			j++;
		}
		count+=j;
		if(i >= k)
		{
			count(i,k);
		}
		else
			System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		count=n;
		count(n,k);
		k=sc.nextInt();
	}

}
