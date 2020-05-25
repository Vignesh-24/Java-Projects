package hackernk;
import java.util.*;

public class assembly {
	public static boolean prime(int n)
	{
		int flag=1;
		for(int k=2;k<=n/2;k++)
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
	public static void main(String args[])
	{
		int n,num1=2,num2=2;int flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter :");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i==0) {
				System.out.print(num1+" "+"\n");
				num1++;num2++;
				continue;
			}
				if(i%2==0)
				{
					for(int j=0;j<=i;j++)
					{
					while(true)
					{
					if(prime(num1)) {
					System.out.print(num1+" ");
					break;
					}
					else
					{
						num1=num1+1;
					}
					}
					num1++;
				}
				}
				else
				{
					for(int m=0;m<=i;m++)
					{
					while(true)
					{
					if(!prime(num2)) {
					System.out.print(num2+" ");break;}
					else
					{
						num2=num2+1;
					}
				}
					num2++;
				}
				}
			
			System.out.println();
		}
		
	}

}
