package com.iu.study4;

public class StudentView {
	//Student 정보를 출력
	//메소드명: view
	public void view(Student s) {
		System.out.println(s.name);
		System.out.println(s.gender);
	}
	
	//메소드명: viewAll
	//모든 student의 정보를 출력
	//단, viewAll의 매개변수는 딱 한개만 선언
	public void viewAll(Student[] sa) {
		for(int i=0; i<sa.length; i++) {
			System.out.println(sa[i].name);
			System.out.println(sa[i].gender);
		}
	}
}
