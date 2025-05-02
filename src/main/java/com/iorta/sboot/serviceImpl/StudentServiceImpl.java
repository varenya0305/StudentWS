package com.iorta.sboot.serviceImpl;

import org.springframework.stereotype.Service;

import com.iorta.sboot.dto.Student;
import com.iorta.sboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Override
	public Student findStudentGradeService(Student student) {
		student.setGrade(getGrade(student.getTotal()));
		return student;
	}
	
	
	private String getGrade(int total) {
		String grade = "";
		if(total >= 500) {
			grade = "A";	
		} else if (total > 400 && total < 500) {
			grade = "B";
		} else if (total > 300 && total < 400) {
			grade = "C";
		} else {
			grade = "D";
		}
		return grade;
	}
}
