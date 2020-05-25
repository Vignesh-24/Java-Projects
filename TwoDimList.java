package prepare;
import java.util.*;
public class TwoDimList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ArrayList<Integer>> llist=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<5;i++) {
		llist.add(new ArrayList<Integer>());
		for(int j=0;j<3;j++) {
			llist.get(i).add(j);
			}
		}
	 int x=llist.get(1).size();
	 System.out.println(x);
     
	}
}
