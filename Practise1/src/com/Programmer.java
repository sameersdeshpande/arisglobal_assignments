package com;

class E
{
	float salary=40000;
	
}
public class Programmer extends E
{
	int bonus=10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programmer p1=new Programmer();
		Programmer p2= new Programmer();
		System.out.println("Programmer of salary is:" +p1.salary);

	}

}
