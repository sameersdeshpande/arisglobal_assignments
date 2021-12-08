package com;



public class TestOverloading21 {
	
	void sum(int a, long b)
	{
		System.out.println(a+b);
	}
	
	void sum (int a , int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestOverloading21 obj= new TestOverloading21();
		obj.sum(20, 20);
		obj.sum(2,4,5);
	}

}
