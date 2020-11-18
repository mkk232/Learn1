package com.koreait.exam.ch03;

public class NumBoxChild extends NumBox {
	public NumBoxChild() {
		super(7); // 기본생성자가 없으면 매개변수를 받는 생성자를 호출한다. 
		// 1. 생성자는 무조건 클래스의 이름과 같아야한다.
		// 2. return타입이 없다. 이것 2개 안지키면 무조건 생성자 아님
	}
}
