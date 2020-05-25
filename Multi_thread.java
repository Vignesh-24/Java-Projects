package muthithreading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class abc implements Runnable
{
	Impl im=new Impl();
	public void run()
	{
		im.fun1();
	}
}
class Impl
{
	public void fun1()
	{
		for(int i=1;i<5;i++) {
			System.out.println("Hi abc");
			if(i==2){
			try {this.wait();}catch(Exception e) {}}
		}
	}
	void fun2()
	{
		for(int i=1;i<5;i++) {
			System.out.println("Hi newabc");
			if(i==3)
			{
		try {this.notify();}catch(Exception e) {}
			}
		}
	}
}
class newabc implements Runnable
{
	Impl im=new Impl();
	public void run()
	{
	  im.fun2();	
	}
	
}

public class Multi_thread {

	public static void main(String[] args) {
		Thread t1=new Thread(new abc());
		Thread t2=new Thread(new newabc());
		t1.start();
		t2.start();
	}

}
