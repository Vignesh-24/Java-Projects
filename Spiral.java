 package prepare;
import java.util.Scanner;
public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[][]=new int[n][n];
		int upper=0,bottom=n-1,left=0,right=n-1;
		while(upper<=bottom)
		{
			for(int i=left;i<=right;i++)
				arr[upper][i]=count++;
			upper++;
			for(int i=upper;i<=bottom;i++)
				arr[i][right]=count++;
			right--;
			for(int i=right;i>=left;i--)
				arr[bottom][i]=count++;
			bottom--;
			for(int i=bottom;i>=upper;i--)
				arr[i][left]=count++;
			left++;	
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}

	}

}
