package com.luv2code.curddemo;

import com.luv2code.curddemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.curddemo.dao.StudentDAO;
import java.util.List;


@SpringBootApplication
public class CurdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return selfDefinedRunner -> {
//			createStudent(studentDAO);
//			createMultipleStudent(studentDAO);
//			readStudent(studentDAO, 124);

//			readAllStudent(studentDAO);
//			findByFirstName(studentDAO,"EEE");
//			updateStudentFirstName(studentDAO, 126, "JackFree");
			updateMultiStudentLastName(studentDAO, "EEE", "AAAAAAAA");
//			deleteOneStudent(studentDAO, 118);

		};

	}

	public void deleteOneStudent(StudentDAO studentDAO, int id) {
		studentDAO.deleteOneStudent(id);
	}

	public void updateMultiStudentLastName(StudentDAO studentDAO, String FirstName, String newLastName) {
		studentDAO.updateMultiStudentLastName(FirstName, newLastName);
	}


	public void updateStudentFirstName(StudentDAO studentDAO, int id, String newFirstName) {
		studentDAO.updateStudentFirstName(id, newFirstName);
	}

	public List<Student> findByFirstName(StudentDAO studentDAO, String someFirstName){
		List<Student> someStudentList = studentDAO.findByFirstName(someFirstName);
		for (Student student: someStudentList) {
			System.out.println(student);
		}
		return someStudentList;
	}

	public List<Student> readAllStudent(StudentDAO studentDAO) {
		List<Student> allStudentList = studentDAO.findAllStudent();
		for (Student student: allStudentList) {
			System.out.println(student);
		}
		return allStudentList;
	}

	public Student readStudent(StudentDAO studentDAO, int studentID) {
		Student targetStudent = studentDAO.findStudent(studentID);
		System.out.println("Find student: ");
		System.out.println(targetStudent);
		return targetStudent;
	}

	public void createMultipleStudent(StudentDAO studentDAO) {
		// Create three student object
		System.out.println("Creating three new student objects......");
		Student s1 = new Student("DDD", "White", "AAAWhite@gmail.com");
		Student s2 = new Student("EEE", "White", "BBBWhite@gmail.com");
		Student s3 = new Student("FFF", "White", "CCCWhite@gmail.com");

		// Save the student object
		System.out.println("Saving three new student objects......");
		studentDAO.save(s1);
		studentDAO.save(s2);
		studentDAO.save(s3);

		// Print id of the student
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
	}

	public void createStudent(StudentDAO studentDAO) {
		// Create one student object
		System.out.println("Creating a new student object......");
		Student s1 = new Student("Catherine", "White", "CathWhite@gmail.com");

		// Save the student object
		System.out.println("Saving the new student object......");
		studentDAO.save(s1);

		// Print id of the student
		System.out.println(s1);
	}




}
