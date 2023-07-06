package com.iu.study4.s4;

import com.iu.study4.s2.Student;
import com.iu.study4.s3.Car;

public class S4Main {
	public static void main(String[] args) {
		Car car = new Car();
//		System.out.println(car.brand); //brand의 접근지정자가 default라서 접근 불가
		car.info();
		
		Product product = new Product();
//		product.info();
//		product.name=""; //private라 접근 불가 
		
//		Student st = new Student();
//		com.iu.study4.s2.Student student = new com.iu.study4.s2.Student();
	
	}
}
