package prepare;
class Parent
{
	private int value;
	Parent()
	{
		System.out.println("No data Found");
		
	}
	Parent(int val)
	{
		this.value=val;
	}
	 int getData()
	{
		return this.value;
	}
}
class Child extends Parent
{
	Child(int val) {
		super(val);
	}
	Child()
	{
		System.out.println("No data in Child");
	}
	
}
public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		System.out.print(obj.getData());

	}

}
