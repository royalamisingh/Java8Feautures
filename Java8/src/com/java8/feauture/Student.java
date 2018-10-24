package com.java8.feauture;

public class Student{
    private String studentname;
    private int rollno;
    private int studentage;
    private String gender;


	public Student(int rollno, String studentname, int studentage, String gender) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
         this.gender = gender;
    }

    public String getStudentname() {
         return studentname;
    }
    public void setStudentname(String studentname) {
	this.studentname = studentname;
    }
    public int getRollno() {
	return rollno;
    }
    public void setRollno(int rollno) {
	this.rollno = rollno;
    }
    public int getStudentage() {
	return studentage;
    }
    public void setStudentage(int studentage) {
 	this.studentage = studentage;
    }
    

    public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + ", Gender=" + gender + "]";
	}
}
