package com.koreait.exam.ch02;

public class MethodTest1 {
	public static void main(String[] args) {
		int res = calc(5, 11);
		System.out.println("result : " + res);
		
		calcVoid(5, 11);
	}
	
	public static int calc(int n1, int n2) {
		return n1 * 2 + n2;
	}
	
	public static void calcVoid(int n1, int n2) {
//		System.out.println("result : " + (n1 * 2 + n2));
		System.out.println("result : " + calc(n1, n2)); // 재활용 하기
		
		return; // 생략되어 있음. 함수는 return을 만나야 종료가 된다.
	}
}
