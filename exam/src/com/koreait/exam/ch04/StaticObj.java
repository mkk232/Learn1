package com.koreait.exam.ch04;

public class StaticObj {
	static int val; 
	
	public static int sum(int n1, int n2) {
		return n1 + n2 + val;
	}
}

class NonStaticObj{
	int val;
	
	public int sum(int n1, int n2) {
		return n1 + n2 + val;
	}
}
// 스태틱이 붙지않은 메소드를 사용할때 변수도 스태틱을 붙이면 안된다.

// 전역변수 빼고는 다 붙여도됨