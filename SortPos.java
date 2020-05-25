package zohoques;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SortPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		int temp;
		for(int i=1;i<=n;i++)
			arr[i]=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i>=n-1)
				break;
			if(i%2==0)
			{
				for(int j=i+2;j<=n;j=j+2)
				{
					if(arr[i] > arr[j])
					{	
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			else
			{
				for(int j=i+2;j<=n;j=j+2)
				{
					if(arr[i] < arr[j])
					{	
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}		
		}
		for(int i=1;i<=n;i++)
		System.out.print(arr[i]+ " ");	
	}
}
