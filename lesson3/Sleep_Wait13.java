package com.lesson3;

class Customer{  

	 int amount=10000;  
	   
	 	synchronized void withdraw(int amount){  
	 	System.out.println("going to withdraw...");  
	 	  
	 		if(this.amount<amount)
	 		{  
	 		System.out.println("Less balance; waiting for deposit...");  		
	 		try{
	 			wait();
	 		   }
	 		catch(Exception e){}  
	 		}  
	 		this.amount-=amount;  
	 		System.out.println("withdraw completed...the lefft over amount is"+ this.amount);  
	 	}  
	   
	 	synchronized void deposit(int amount){  
	 		System.out.println("going to deposit...");  
	 		this.amount+=amount;  
	 		
	 		System.out.println("deposit completed... " + this.amount);  
	 		notify();  //unlocking of thread
	 	}  
	 }  
	   

public class Sleep_Wait13 extends Thread
{
	 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{
		    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
		  }  
		 }  


		
		 public static void main(String args[]){  
		  Sleep_Wait13 t1=new  Sleep_Wait13 ();  
		  t1.setName("Java");
		  t1.setPriority(MAX_PRIORITY); 
		  
		  Sleep_Wait13  t2=new  Sleep_Wait13 ();  
		  t2.setName("Python");
		  
		  Sleep_Wait13  t3=new  Sleep_Wait13 (); 
		  t3.setName("Oracle");
		  
		  Sleep_Wait13 t4=new  Sleep_Wait13 (); 
		  t4.setName("C++");
		   
		  t1.start();  
		  t2.start();  
		  t3.start();
		  t4.start();
		  
		  System.out.println(t1.getState());
		  System.out.println(t3.getState());
		  System.out.println(t2.getState());
		  
		   
		  final Customer c=new Customer();  	
			 		
			 		new Thread(){                 // anonymous class
			 		  public void run()
			 		  {
			 			c.withdraw(5000);
			 		  }  
			 		}.start(); 
			 		new Thread(){                 // anonymous class
			 			  public void run()
			 			  {
			 				c.withdraw(4000);
			 			  }  
			 			}.start(); 
			 		new Thread(){                 // anonymous class
			 				  public void run()
			 				  {
			 					c.withdraw(10000);
			 				  }  
			 				}.start(); 
			 		
			 		new Thread(){  
			 		  public void run()
			 		   {
			 			 c.deposit(20000);
			 		   }  
			 		}.start();    
			 	}
			 
		 }  
	 
