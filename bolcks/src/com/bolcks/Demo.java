package com.bolcks;

public class Demo {
	public void demo() {
		System.out.println("method demo");
		
	}
	public Demo(){
		System.out.println("constructor demo");
		
	}
	static {
		System.out.println("static");
	}
	{
		System.out.println("instance");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Demo d=new Demo();
		d.demo();
		
		
	}

}
