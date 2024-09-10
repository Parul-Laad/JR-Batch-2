package com.java.Student.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.Connect.DataConnect;
import com.java.Model.Student;

public class IStudentDao {
	
	Connection con;
	PreparedStatement stat;
	public IStudentDao()
	{
		con=DataConnect.getConnect();
		
	}
	   

	public void insert1(Student s) {
		
		
		try
		{
		stat=con.prepareStatement("insert into student values(?,?,?)");
		stat.setInt(1, s.getRollno());
		stat.setString(2, s.getName());
		stat.setDouble(3,s.getFee());
		
		stat.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
		
	}

public  void remove(int roll)
	{
	try {
		String sql="delete from student where rollno=?";
		stat=con.prepareStatement(sql);
		stat.setInt(1,roll);
		int k = stat.executeUpdate();
		
		if(k>0)
		{
			System.out.println("Removed");
		}
		else {
			System.out.println("Not Removed");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	 public void showAll() {
	        try {
	            String sql = "SELECT * FROM student";
	            stat = con.prepareStatement(sql);
	            ResultSet rs = stat.executeQuery();

	            while (rs.next()) {
	                int rollno = rs.getInt("rollno");
	                String name = rs.getString("name");
	                double fee = rs.getDouble("fee");

	                System.out.println("Roll No: " + rollno + ", Name: " + name + ", Fee: " + fee);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public void updateFee(int roll, double fee) {
		 try {
		 
			 String sql="update student set rollno=? where fee=?";
		     stat=con.prepareStatement(sql);
		     stat.setInt(1,roll);
		     stat.setDouble(2,fee);
		     int k=stat.executeUpdate();
		     if(k>0) {
		    	 System.out.println("Record Updated");
		     }
		     else {
		    	 System.out.println("not found");
		     }
		     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 
	}

/*void update ser()
{
int roll;
Double fee;
sop("enter roll ");
int roll=sc.nextInt();
sop("enter new fee")
double fee=sc.nextDouble();
dao.updateFee(roll,fee);
}
 
 
public void updateFee(int roll, double fee)
{
String sql="update student set fee=? where roll=?";
stat=con.preparedstatement(sql)
stat.setInt(roll);
stat.setDouble(fee);
int k=stat.executeUpdate()
if(k>0)
{
   sop("Record updated")
}
else
{
  sop("not found");
}
}

has context menu


has context menu */
 
		
		
		


