package com.thread;

public class ThreadsRunnable12  implements Runnable
{  
	
	public  void run()
	{  
		System.out.println("thread is running...");  
	}  
	  
	public static void main(String args[])
	{  
	
		ThreadsRunnable12 m1=new ThreadsRunnable12();       
		Thread t1 = new Thread(m1);                     
		t1.start();        
	}  
}  

