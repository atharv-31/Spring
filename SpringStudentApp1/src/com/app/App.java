package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Student;
import com.config.AppConfig;
import com.service.StudentService;

public class App {
	
	public static void main(String args[]) {
		
		//AnnotationConfigApplicationContext context = AnnotationConfigApplicationContext(AppConfig.class); 
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		StudentService service = 
				(StudentService) context.getBean("studentServiceImpl");
		
		Student student=new Student(11,"Atharv",90.00);
		Student student1=new Student(12,"Pratil",90.00);
		Student student2=new Student(13,"Tushar",90.00);
		
		service.addStudent(student);service.addStudent(student1);
		service.addStudent(student2);
		
		System.out.println("is Avilable "+service.isAvailable(student));
		
		System.out.println(service.findAllStudent());
		}

}
