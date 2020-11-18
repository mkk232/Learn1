package com.koreait.exam.ch03;

public class NumBox {
	public int val;
	
	public NumBox() {
		
	}
	
//	this() super(), this. super. 차이점 알아두기
	public NumBox(int val) {
		super(); // 기본생성자 부모 주소 스택형식이기때문에 가장 먼저 적어야함. 부모부터 적어야함
		System.out.println("NumBox 기본 생성자 호출");
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	@Override
	public boolean equals(Object nb) {
		return this.val == ((NumBox)nb).val;
	}
	
	@Override
	public String toString() {
		return this.val + "";
		return Integer.toString(this.val);
	}
	
}
