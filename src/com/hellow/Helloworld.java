package com.hellow;

class A{
	static void main() {
		System.out.println("k");
	}
	static {
		System.out.println("no");
	}
	{ 
        // This code is executed before every constructor. 
        System.out.println("Common part of constructors invoked !!"); 
    } 
}

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A ob=new A();
		ob.main();
	}

}
