package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Student;
import com.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentDao studentDao;

	public StudentDao getStudentdao() {
		return studentDao;
	}

	@Autowired
	public void setStudentdao(StudentDao studentdao) {
		this.studentDao = studentdao;
	}

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.insertStudent(student);
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.removeStudent(student);
	}

	@Override
	public boolean isAvailable(Student student) {
		// TODO Auto-generated method stub
		return studentDao.checkStudent(student);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentDao.findStudentById(id);
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

	@Override
	public void updateStudent(int id, Student upstudent) {
		studentDao.modifyStudent(id, upstudent);
		
	}

}
