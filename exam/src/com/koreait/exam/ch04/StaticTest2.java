package com.koreait.exam.ch04;

public class StaticTest2 {
	public static void main(String[] args) {
		StaticObj so1 = new StaticObj();
		StaticObj so2 = new StaticObj();
		
		so1.val = 10;
		System.out.println(so1.val);
		
		so2.val = 20;
		
		StaticObj.val = 30;
		System.out.println(so2.val);
		System.out.println(so1.val);
		
		System.out.println(StaticObj.val);
		
	}
}
