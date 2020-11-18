package com.koreait.exam.ch04;

import com.koreait.exam.ch03.NumBox;

public class RefPrimitiveDiff {
	public static void main(String[] args) {
		int n1 = 10;
		
		changeInt(n1);
		System.out.println("n1 : " + n1);
		
		NumBox nb1 = new NumBox(10);
		changeNumBox(nb1);
		System.out.println("nb1.val : " + nb1.val);
	}
	
	public static void changeInt(int num1) {
		num1 = 20;
		System.out.println("num1 : " + num1);
	}
	
	public static void changeNumBox(NumBox numbox1) {
		numbox1.setVal(20);
	}
}

/*
 * n1과 num1은 완전히 다른것임. n1을 매개변수로 넘겨주고 num1의 값을 아무리 바꿔도 n1의 값은 바뀌지 않음
 * 
 * nb1에는 객체의 주소값이 들어있음. 그래서 그 주소값을 changeNumBox에 주소값을 넘겨주고
 * 메소드에서 그 주소값을 참조하여 값을 바꿈. 
 * 
 */


