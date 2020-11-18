package com.koreait.exam.ch05;

public class MyListTest {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(100);
		list.add(3, 500);
		
		int delVal = list.remove(5);
		System.out.println("delVal : " + delVal);
		list.showMyArr();
		int size = list.size();
		System.out.println(size);
	}
}
