package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Arthi");
	}

	public void studentDept() {
		System.out.println("EIE");
	}
	
	public void studentId() {
		System.out.println("20010");
	}
	public static void main(String[] args) {
		Student ug = new Student();
		ug.collegeName();
		ug.collegeCode();
		ug.collegeRank();
		ug.deptName();
		ug.studentName();
		ug.studentDept();
		ug.studentId();

	}

}
