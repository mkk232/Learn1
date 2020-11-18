package com.koreait.exam.ch03;

public class CardTest {
	public static void main(String[] args) {
		Card c1 = new Card("", "");
		Card c2 = new Card("", "");
		
		System.out.println("c1 == c2 : " + (c1 == c2));
		/*
		c1.setShape("하트");
		c2.setShape("클로버");
		*/
		
		System.out.println("c1.equals(c2) : " + c1.equals(c2));
		
		c1 = c2;
		System.out.println("c1.equals(c2) : " + c1.equals(c2));
		System.out.println("c1 == c2 : " + (c1 == c2));
		
		System.out.println("c1 : " + c1.getShape());
		System.out.println("c1 : " + c2.getShape());
	}
}
