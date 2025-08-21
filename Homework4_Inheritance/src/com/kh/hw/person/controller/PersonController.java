package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int count[] = new int[2];
		int studentCount = 0;
		int employeeCount = 0;
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null) {
				studentCount++;
			}
		}
		count[0] = studentCount;
		for(int i=0;i<e.length;i++) {
			if(e[i]!=null) {
				employeeCount++;
			}
		}
		count[1] = employeeCount;
		
		return count;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i<s.length;i++) {
			if(s[i]==null) {
				s[i]= new Student(name,age,height,weight,grade,major);
				return;
			}
		}
		
	}
	public Student[] printStudent() {
		int count = personCount()[0];
		if(count == 0) return null;
		Student[] students = new Student[count];
		int index = 0;
		for(int i = 0; i<personCount()[0];i++) {
			students[index++] = s[i];
		}
		return students;
		
	}
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i=0; i<e.length;i++) {
			if(e[i]==null) {
				e[i] = new Employee(name,age,height,weight,salary,dept);
				return;
			}
		}
	}
	
	public Employee[] printEmployee() {
		
		int count = personCount()[1];
		if(count == 0) return null;
		
		Employee[] employees = new Employee[count];
		int index = 0;
		for(int i =0; i<e.length;i++) {
			if(e[i] != null) {
				employees[index++] = e[i];
				
			}
		}
		return employees;
	}
	
	
}
