package com.java.demo.Service;

import java.util.Scanner;

import com.java.Model.Student;
import com.java.Student.Dao.IStudentDao;

public class StudentService {
	
	Scanner sc ;
	IStudentDao dao;
	
	
	public StudentService() {
		
		sc=new Scanner(System.in);
		dao=new IStudentDao();
		
	}
		public void addData()
		{
			Student s =new Student();
			System.out.println("enter roll no ");
			s.setRollno(sc.nextInt());
			
			System.out.println("enter name no ");
			sc.nextLine();
			s.setName(sc.nextLine());
			
			System.out.println("enter fee");
			s.setFee(sc.nextDouble());
			
			dao.insert1(s);
			
			
			
		}
		
		public void removeData() {
			Student s =new Student();
			System.out.println("enter roll no ");
			s.setRollno(sc.nextInt());
			
			dao.remove(s.getRollno());
		}
		
		public void show() {
			
			dao.showAll();
		}
		
		public void update() {
			int roll;
			Double fee;
			System.out.println("enter roll no to update ");;
			int roll1=sc.nextInt();
			System.out.println("enter new fee");
			double fee1=sc.nextDouble();
			dao.updateFee(roll1,fee1);
		}
		
		
		
		

	
	
	
	
	
	
	

}
