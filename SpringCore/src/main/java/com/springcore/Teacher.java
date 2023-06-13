package com.springcore;

public class Teacher {
     private String teacherName;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Teacher(String teacherName) {
		super();
		this.teacherName = teacherName;
	}
     
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + "]";
	}
     
}
