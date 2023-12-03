package com.kk.ds;

public class StudentTest {

	private int a=10;
	public StudentTest(int a) {
		this.a=a;
	}
	
	public StudentTest(StudentTest student) {
		this.a=student.a;
	}
	
	public static void main(String[] args) {
		StudentTest s1=new StudentTest(5);
		System.out.println("s1.a  "+s1.a);
		StudentTest s2=s1;
		System.out.println("s2.a  "+s2.a);
		StudentTest s3=s1;
		s3.a=12;
		System.out.println("s3.a  "+s3.a);
		System.out.println("s1.a  "+s1.a);
		StudentTest s4=new  StudentTest(s1);
		System.out.println(s4.a);
		
	}
}
