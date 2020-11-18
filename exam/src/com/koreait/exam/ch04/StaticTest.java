package com.koreait.exam.ch04;

public class StaticTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 22;

		int result = StaticObj.sum(num1, num2);

		System.out.println(result);

		NonStaticObj nso = new NonStaticObj();

		result = nso.sum(num1, num2);

		System.out.println(result);

	}
}
