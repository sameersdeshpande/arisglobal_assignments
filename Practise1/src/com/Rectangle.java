package com;

public class Rectangle {

	int length;
	int width;
	void insert(int l, int w)
	{
		length = l;
		width = w;
		
	}
	
	void calculatearea()
	{
		System.out.println("Area of rectangle" +" "+ (length * width));
		
	}
}
