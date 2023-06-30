package com.iu.study4.s2;

import java.util.Scanner;
//학생 생성 및 정보 입력
public class StudentService {
	public Student makeStudentOne() {
		//학생 1명을 만들어서 이름, 번호, 국어, 영어, 수학
		//총점 평균을 계산
		//학생을 리턴
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.println("이름을 입력하세요");
		s.name = sc.next();
		
		System.out.println("번호를 입력하세요");
		s.num = sc.nextInt();
		
		System.out.println("국어 성적을 입력하세요");
		s.kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		s.eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		s.math = sc.nextInt();
		
		s.total = s.kor+s.eng+s.math;
		s.avg = s.total/3;
		
		return s;
	}
	
	
	
	//Student 배열 생성 
	public Student[] makeStudents() {
		//학생 수 입력받기(스캐너)
		//학생 수 만큼 학생들이 만들어짐 
		//이름, 번호, 국어, 영어, 수학 점수입력
		//총점, 평균 계산
		//학생들을 리턴
		//1.학생 배열을 생성
		//2.학생 수 만큼 반복문 실행
		//3.반복문 내에서 이름, 번호, 국어, 영어, 수학 입력 총점 평균
		//4.해당 학생을 배열에 대입
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요");
		int n = sc.nextInt();
		//1
		Student[] sa = new Student[n];
		//2
		for(int i=0; i<n; i++) {
			Student s = new Student();
			//3
			System.out.println("이름을 입력하세요");
			s.name = sc.next();
			
			System.out.println("번호를 입력하세요");
			s.num = sc.nextInt();
			
			System.out.println("국어 성적을 입력하세요");
			s.kor = sc.nextInt();
			
			System.out.println("영어 점수를 입력하세요");
			s.eng = sc.nextInt();
			
			System.out.println("수학 점수를 입력하세요");
			s.math = sc.nextInt();
			
			s.total = s.kor+s.eng+s.math;
			s.avg = s.total/3;
			//4
			sa[i] = s;
		}
		return sa;
	}
}
