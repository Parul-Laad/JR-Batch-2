package com.hexaware.app.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.app.Dao.RepStudent;
import com.hexaware.app.Entity.Student;

@SpringBootTest
public class StudentRepoJpaMethodTest {
	
	@Autowired
	RepStudent rep;
	
	
	@Test
	void saveTest() {
		Student s = new Student(122, "viraaj",27,50500.20,"viraaj@gmail.com","viraaj home address.");
		rep.save(s);
		
	}
	
	
    // Test case for finding student by roll number
    @Test
    void findByRollNumberTest() {
        Student s = rep.findById(122).orElse(null);
        System.out.println("Found student: " + s);
    }
    
    

    // Test case for finding all students
    @Test
    void findAllStudentsTest() {
        List<Student> students = (List<Student>) rep.findAll();
        for (Student s : students) {
            System.out.println("Found student: " + s);
        }
    }
    



    // Test case for updating a student's name
    @Test
    void updateStudentNameTest() {
        Student s = rep.findById(122).orElse(null);
        if (s != null) {
            s.setName("Updated Viraaj");
            rep.save(s);
            System.out.println("Updated student: " + s);
        } else {
            System.out.println("Student not found.");
        }
    }
    

	
    
    // Test case for deleting a student by roll number
    @Test
    void deleteStudentTest() {
        Student s = rep.findById(122).orElse(null);
        if (s != null) {
            rep.delete(s);
            System.out.println("Deleted student: " + s);
        } else {
            System.out.println("Student not found.");
        }
    }
	


}
