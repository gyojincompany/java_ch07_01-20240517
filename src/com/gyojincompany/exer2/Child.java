package com.gyojincompany.exer2;

public class Child extends Parent{
	
	private int studentNo;

	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}

//	public Child(String name, int studentNo) {
////		super("홍길동"); // 부모클래스의 생성자 반드시 호출!
//		
//		this.name = name;
//		this.studentNo = studentNo;
//	}
	
	
	
}
