package prepare;
import java.util.*;
public class Amcat1 {
	
	List<Integer> find(int a[],int size,int key)
	{
		int val=0,k=key,sum=0;
		List<Integer> mylist=new ArrayList<Integer>();
		if(key>0)
		{
			for(int i=0;i<size;i++)
			{
				val=i+1;
				while(key!=0)
				{
					if(val==size)
						val=0;
					sum+=a[val];
					key--;
					val++;
				}
				mylist.add(sum);
				key=k;sum=0;
			}
		}
		else
		{
			for(int i=0;i<size;i++)
			{
				val=i-1;
				while(key!=0)
				{
					if(val<0)
						val=size-1;
					sum+=a[val];
					key++;
					val--;
				}
				mylist.add(sum);
				key=k;sum=0;
			}
		}
		return mylist; 
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int key=sc.nextInt();
		List<Integer>  mylist=new ArrayList<Integer>();
		int []arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		Amcat1 am=new Amcat1();;
		mylist=am.find(arr, size, key);
		for(int i : mylist)
		{
			System.out.print(i+" ");
		}

	}

}
