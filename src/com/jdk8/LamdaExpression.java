package com.jdk8;

interface A{
	
	void add();
}

public class LamdaExpression {
	static  void  add() {
	  System.out.println("hii");
  }
	
	public static void main(String[] args) {
		
		A a=LamdaExpression::add;
		a.add();
	
		  
	    }  
	}  
	
	

	
