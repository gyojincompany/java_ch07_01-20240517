package com.gyojincompany.exer2;

public class Triange extends Shape {

	@Override
	public void areaPrint() {
		// TODO Auto-generated method stub
//		super.areaPrint(); // 부모클래스에서 정의된 원본 메소드 호출
		System.out.println(width * height *0.5);
	} // Shape 클래스를 상속 받음

//	@Override
//	public void namePrint() {
//		// TODO Auto-generated method stub
//		System.out.println("도형이름:Triangle");
//	}

//	public void areaPrint() { //오버라이딩->삼각형 넓이 출력
//		System.out.println(width * height *0.5);
//	}
	
	
	
	
}
