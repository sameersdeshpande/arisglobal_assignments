package com;

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is ");
	}
}

 public class Bike extends Vehicle  {
	
		 //void run()
		//{
			System.out.println("Bike is running ");
			
		//}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bike obj = new Bike();
		obj.run();
	}

}
