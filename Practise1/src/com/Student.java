package com;
class Student
{
	int rollno;
	String name;
	float fee;
	Student (int rollno, String name, float fee)
	{
		this.rollno= rollno;
		this.name= name;
		this.fee=fee;
		
	}
	
	void display()
	{
	   System.out.println(this.rollno + this.name+ this.fee);
	
	}
}
class TestThis{
	public static void main(String[] args)
	{
		Student s1= new Student(111,"Ankit", 5000f);
		Student s2= new Student(112,"sumit",6000f);
		s1.display();
		s2.display();
		
		
	}
}
