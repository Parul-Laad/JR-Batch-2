package com.java.Connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnect {

	
	 private static   Connection con;
	 
	 
	 public DataConnect() {
		
		 try
		 {
			// com.mysql.cj.jdbc.Driver 
			 //jdbc:mysql://localhost:3306/school
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","nutanlaad@10"); 
			System.out.println("done ");
			 
	 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		 
		 
		 
	}
	  
	 
	public static  Connection getConnect()
	 {
		 
		 DataConnect d1= new DataConnect();
		 return(con);
		 
		 
	 }
	
	
	
	
	
	
	
}
