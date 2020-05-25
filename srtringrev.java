package prepare;

import java.util.Scanner;

public class srtringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new Scanner(System.in).nextLine();
		char a[]=str.toCharArray();
		int len=str.length()-1;
		int i=0;
		char b;
		while(i<len)
		{
			if(Character.isAlphabetic(a[i])&&Character.isAlphabetic(a[len]))
			{
				b=a[i];
				a[i]=a[len];
				a[len]=b;
				len--;
				i++;
			}
			else if(Character.isAlphabetic(a[i]))
			{
				len--;
				
			}
			else
			{
				i++;
			}
		}
		for(char d:a)
			System.out.print(d);

	}

}
