package prepare;
import java.util.LinkedList;
import java.util.Scanner;
public class LRU {
	static int findFault(int arr[],int size,int n)
	{
		int count=0;
		LinkedList<Integer> llist=new LinkedList<Integer>();
		for(int i=0;i<n;i++)
		{
			if(llist.contains(arr[i]))
			{
				llist.remove(new Integer(arr[i]));
				llist.addFirst(arr[i]);
				continue;
			}
			else
			{
				if(size!=0)
				{
					llist.addFirst(arr[i]);
					count++;
					size--;
				}
				else
				{
					System.out.println("Removed :"+llist.removeLast());
					llist.addFirst(arr[i]);
					System.out.println(llist);
					count++;
				}
			}
		}
		return count;
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int size=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Total fault : " + findFault(arr,size,n));
	}
}
