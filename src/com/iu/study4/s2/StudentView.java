package com.iu.study4.s2;
//학생 출력
public class StudentView {
	public void view(Student s) {
		//검색된 학생 하나만 출력
		if(s!=null) {
			System.out.println(s.getName());
			System.out.println(s.getNum());
			System.out.println(s.getAvg());
		}else {
			System.out.println("학생이 없습니다");
		}
	}
	
	public void view(Student[] sa) {
		for(int i=0; i<sa.length; i++) {
			Student s = sa[i];
			//위의 3줄을 1줄로 바꾸기
			this.view(s);
			
			System.out.println("==================================");
		}
	}
}
