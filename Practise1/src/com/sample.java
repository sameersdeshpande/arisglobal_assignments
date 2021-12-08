package com;
import java.sql.*;


public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement s;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gyro","root","");
			s=con.createStatement(); ResultSet r=s.executeQuery("Select * from emp");
			while(r.next())
			{
			 System.out.println(r.getString("name")+"\t"+r.getString("designation")+"\t"+r.getString("city")+"\t"+r.getString("state")+"\t"+r.getString("country"));
			}
			/*
			 * if(con!=null) 
			 * {
			 * 		System.out.println("Connected");
			 * }
			 * else
			 * {
			 * 		System.out.println("Not Connected");
			 * }
			 */
		}
		catch(Exception e)
		{
			System.out.println("Not Connected");
		}
		
		
	}

}
