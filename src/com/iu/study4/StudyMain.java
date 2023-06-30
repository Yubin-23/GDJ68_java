package com.iu.study4;

public class StudyMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name = "홍길동";
		s1.gender = '남';
		
		Student s2 = new Student();
		
		s2.name = "김철수";
		s2.gender = '남';
		
		StudentView sv = new StudentView();
		
		Student[] sa = {s1, s2};
		
		sv.view(s1);
		sv.viewAll(sa);
	}
}
