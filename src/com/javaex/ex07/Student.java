package com.javaex.ex07;

public class Student extends Person {

	// 필드
	private String schollName;
	private String age;
	// 생성자

	public Student(String name, int age, String schollName) {
		super(name, age);
		this.schollName = schollName;
	}

	public Student(String name, int age) {
		super();
	}

	public Student() {
		super();
	}

	// gs
	public String getSchollName() {
		return schollName;
	}

	public void setSchollName(String schollName) {
		this.schollName = schollName;
	}
	
	//메소드 일반
	
	public void showinfo() {
		System.out.println("학교"+ this.schollName);
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schollName + ", getName()=" + getName() + ", getAge()=" + age + "]";
	}
	
	
	
	

}
