package prepare;

import java.util.Scanner;

public class Prefix_Suffix {
	static int kmpSearch(String str,int n)
	{
		int result=0,i=1,j=0;
		int arr[]=new int[n];
		arr[0]=0;
		while(i<n)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				arr[i]=j+1; 
				i++;
				j++;
			}
			else 
			{
				if(j!=0)
				  j=arr[j-1];
				else
				{
					arr[i]=0;
					i++;
				}
			}
		}
		for(int s :arr)
			System.out.print(s+" ");
		result=arr[n-1];
		return result>n/2?n/2:result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		int i=0,j=0;
		int res=kmpSearch(str,n);
		System.out.println("\n"+res);
		if(res>0)
		{
			if(res<n/2)
			{
				for(i=0;i<res;i++)
					System.out.print(str.charAt(i));
			}
			else
			{
				for(i=res,j=0;i<n;i++)
				{
					if(str.charAt(i)==str.charAt(j))
						break;
				}
				for(j=i;j<n;j++)
					System.out.print(str.charAt(j));
					
			}
		}
		else
		{
			System.out.println("No match");
		}
		
	}

}
