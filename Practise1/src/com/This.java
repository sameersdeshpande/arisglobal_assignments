package com;

class A
{
	A()
	{
		System.out.println("hello a");
	}
	
	A (int x)
	{ 
		this();
		System.out.println(x);
			
		
	}
	
	A(int x, int y)
	{
		this(20);
		System.out.println(x+ " "+y);
	}
}

 class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a3=new A(30,40);
		
		
	}
}
	