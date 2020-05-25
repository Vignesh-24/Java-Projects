package generics;
public class testt {

	public static void main(String[] args)
	{
		//static final Object objmain=new Object();
		t obj=new t("Thread1");
		t1 ob=new t1("Thread2");
		//Thread t1=new Thread(obj,"Thread1");
		//Thread t2=new Thread(ob,"Thread2");
		obj.start();
		ob.start();
	
	}

}

class t extends Thread
{
	t(String name)
	{
		super(name);
	}
	public void run()
	{
		
			
		for(int i=0;i<5;i++)
		{
			if(i==1)
				try {
					this.wait();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Wait prob");
				}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class t1 extends Thread
{
	t1(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		try {
		this.notify();}
		catch(Exception e)
		{
			System.out.println("Notify problem");
		}
	}
}

