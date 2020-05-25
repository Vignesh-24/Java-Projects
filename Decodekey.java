package prepare;

import java.util.Scanner;

public class Decodekey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ans="";
		int flag=0,min=-1;
		String input=sc.nextLine();
		String arr1[]=input.split(",");
		for(int i=0;i<arr1.length;i++) {
		String temp=arr1[i];
		String arr[]=temp.split(":");
		int len=arr[0].length();
		int len2=arr[1].length();
		
		
		for(int j=0;j<len2;j++)
		{
			
			if(len+'0'==arr[1].charAt(j))
			{
				ans+=arr[0].charAt(len-1);flag=1;break;
			}
			else
			{
				if(min<arr[1].charAt(j)-'0' && arr[1].charAt(j)-'0'< len)
					min=arr[1].charAt(j)-'0';
			}
		}
		try {
		if(flag==0 && min!=-1)
			ans+=arr[0].charAt(min-1);
		if(min==-1 && flag==0)
		{
			ans+='X';
		}}catch(Exception e) {ans+='X';}
		finally{flag=0;min=-1;}
		}
		System.out.println(ans);

	}

}
