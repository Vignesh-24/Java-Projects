package zohoques;
import java.util.Scanner;

public class DecodeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int n=input.length()-1;
		int times=0;
		int i=0;
		int point=0;
		while(i<=n)
		{
			sb.append(input.charAt(i));
		    point=i;
		    if((i+2)<=n) {
			if(input.charAt(i+1)<65 && input.charAt(i+2)<65)
			{
				times=Integer.parseInt(String.valueOf(input.charAt(i+1))+String.valueOf(input.charAt(i+2)));
				times--;
				i=i+3;
			}
			else
			{
				times=Integer.parseInt(String.valueOf(input.charAt(i+1)));
				times--;
				i=i+2;
			}
		    }
			else
			{
				times=Integer.parseInt(String.valueOf(input.charAt(i+1)));
				times--;
				i=i+2;
			}
				while(times!=0) {
					sb.append(input.charAt(point));times--;		}		
		}
		System.out.print(sb);

	}

}
