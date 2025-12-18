package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Student;
import com.config.AppConfig;
import com.service.StudentService;

public class App {
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	
	System.out.println("===>"+context.getBean("student11"));
	
	
	StudentService service=(StudentService)context.getBean("studentServiceImpl");
	
	Student student=new Student(11, "Shreyas", 58.95);
	Student student1=new Student(12, "Tejas", 65.55);
	Student student2=new Student(13, "Pratik", 69.55);
	Student student3=new Student(14, "Swapnil", 95.55);
	
	service.addStudent(student);
	service.addStudent(student1);
	service.addStudent(student2);
	service.addStudent(student3);
	
	System.out.println("is available "+service.isAvailableStudent(new Student(13, " Atharv", 69.36)));
	
	System.out.println(service.findAllStudents());
}
}
