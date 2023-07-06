package com.iu.study4.s2;

public class S2Main {
	public static void main(String[] args) {
		//main 메소드의 역할
		//1.프로그램 실행
		//2.테스트 용도 
		
		//객체 생성 
		Chef chef = new Chef();
//		Ramyun[] ramyuns = chef.makeRamyun(3);
//		Ramyun[] ramyuns = new Ramyun[2]; //라면을 담은 쟁반을 생성(종업원)
//		chef.makeRamyun2(ramyuns);
//		System.out.println(ramyuns[0].title);
//		
//		int count = 2;
//		chef.makeRamyun(2);
//		System.out.println(count);
//		
//		chef.makeKimbap();
		
//		StudentService ss = new StudentService();
//		Student[] sa = ss.makeStudents();
//		
//		for(int i=0; i<sa.length; i++) {
//			System.out.println(sa[i].total);
//			System.out.println(sa[i].avg);
//		}
//		
//		Student s = ss.makeStudentOne();
//		System.out.println(s.avg);
		StudentControllor sc = new StudentControllor();
		sc.start();
		
	}
}
