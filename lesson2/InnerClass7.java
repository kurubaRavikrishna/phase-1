package com.lesson2;

public class InnerClass7 
{
private int data=30;  
	
	void display(){
		System.out.println("i am entering to  the outer class method");
	}
	 
	class Inner{  		
	 private int data=50;
	  
	  void msg()
	  {
		  InnerClass7.this.display();
		  System.out.println("data is "+data);
	  }  
	  
	  // calling the duplicate method of the outer class
	  void display(){
		  System.out.println("i am entered to the inner class method");
	  }// inner class accessing the outside private variable
	  class Inner_2{
		  
		  void Inner()
		  {
			  InnerClass7.this.display();
			  System.out.println("data is "+data);
		  }
		  void Inner2()
		  {
			  System.out.println("2nd Inner class");
		  }
		  
	  }
	 }  
	
	public static void main(String args[]){  
	  
	  InnerClass7 obj=new InnerClass7();     // creating object of Outer class
	  
	  InnerClass7.Inner in=obj.new Inner(); 
	  Inner.Inner_2 i=in.new Inner_2();// creating object of Inner class
	  in.msg();  
	  in.display(); 
	  i.Inner();
	  i.Inner2();
	 }  

}

