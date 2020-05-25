package zohoques;
import java.util.*;
public class MergeArray {
	static List<Integer> mergeArray(int arr1[],int arr2[],int size1,int size2)
	{
		List<Integer> my=new ArrayList<Integer>();
		int i=0;
		int j=0;
		while(i<size1 && j<size2)
		{
			if(arr1[i]< arr2[j]) {
				if(!my.contains(new Integer(arr1[i]))) {
				my.add(arr1[i]);}
				i++;
				}
			else if(arr1[i]>arr2[i]) {
				if(!my.contains(new Integer(arr2[j]))) {
				my.add(arr2[j]);}
				j++;}
			else
			{
				if(!my.contains(new Integer(arr2[j]))) {
					my.add(arr2[j]);}
					i++;j++;
			}
		}
		if(i<size1)
		{
			while(i<size1) {
			if(!my.contains(new Integer(arr1[i])))	
				my.add(arr1[i]);
			i++;
			}	
		}
		else
		{
			while(j<size2) {
				if(!my.contains(new Integer(arr2[j])))	
					my.add(arr2[j]);
				j++;
				}	
		}
		return my;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> l1=new ArrayList();
		List l2=new ArrayList();
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		for(int i=0;i<s1;i++)
			l1.add(sc.nextInt());
		for(int i=0;i<s2;i++)
			l2.add(sc.nextInt());
		Set<Integer> s=new HashSet();
		s.addAll(l1);
		s.addAll(l2);
		List<Integer> output=new ArrayList(s);
	    System.out.print(output);
			
     	
			
		
		
		

	}

}
