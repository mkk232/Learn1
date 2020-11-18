package com.koreait.exam.ch06;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void cry() {
		System.out.printf("%s가 운다~~", this.name);
	}
}
