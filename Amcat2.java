package prepare;
import java.util.Scanner;
public class Amcat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[5][5];
		int arr1[][]=new int[5][5];
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		for(int i=0;i<5;i++)
			for(int j=0;j<5;j++)
				arr[i][j]=sc.nextInt();
		if(input ==0)       //right 90"
		{
	     for(int i=0;i<5;i++)
	      {
	    	for(int j=0,k=4;j<5;j++,k--) {
	    		arr1[i][j]=arr[k][i];
	    		System.out.print(arr1[i][j]+" ");
	    	}
	    	System.out.println();
	     }
	   }	
		else
		{
			for(int i=0;i<5;i++)
		      {
		    	for(int j=0;j<5;j++) {
		    		arr1[i][j]=arr[j][4-i];        //n-i
		    		System.out.print(arr1[i][j]+" ");
		    	}
		    	System.out.println();
		     }
		}

	}

}
