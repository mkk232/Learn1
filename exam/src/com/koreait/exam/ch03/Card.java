package com.koreait.exam.ch03;

public class Card {
	private final String shape;
	private final String no;

	public String toString() {
		return "shape : " + this.shape + " / no : " + this.no;
	}

	public String getShape() {
		return shape;
	}

	public String getNo() {
		return no;
	}

	public Card(String shape, String no) {
		this.shape = shape;
		this.no = no;
	}
	
	public static CardDeck pick() {
		
	}

}
