package com.iu.study4.s2;
//학생 출력
public class StudentView {
	public void print(Student[] sa) {
		for(int i=0; i<sa.length; i++) {
			System.out.println("이름: "+sa[i].name+" 번호: "+sa[i].num+" 총점: "+sa[i].total+" 평균: "+sa[i].avg);
		}
	}
}
