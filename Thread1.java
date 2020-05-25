package threadss;
import java.lang.Thread;
import java.util.concurrent.locks.*;


class sum
{
     void update(int i)
	{
		l.lock();
		try
		{
		 
		for(int n=1;n<=5;n++)
			System.out.println(Thread.currentThread().getName()+":"+(i+n));
		}
		finally
		{
			l.unlock();
		}
	}
   /*  void update(int i,int m)
 	{
 		l1.lock();
 		try
 		{
 		 
 		for(int n=1;n<=5;n++)
 			System.out.println(Thread.currentThread().getName()+":"+(i+n)+" "+m);
 		}
 		finally
 		{
 			l1.unlock();
 		}
 	}*/
     
     
	Lock l=new ReentrantLock();
	//Lock l1=new ReentrantLock();
}

class A extends Thread
{
	sum s=new sum();
    public void run()
	{
		s.update(5);
	}
}
class B extends Thread
{
	sum s1=new sum();
    public void run()
	{
		s1.update(15);
	}
}


public class Thread1 {
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		a.setName("Thread A");
		
		b.setName("Thread D");
		a.start();
		
		b.start();
	}
	
}

