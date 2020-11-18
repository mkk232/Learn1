package com.koreait.exam.ch05;
/*
 * 기능은 선언만 함
 * 인터페이스를 상속받으면 무조건 구현을 해야함
 */
public interface MyList {
	int size();
	
	void add(int val);
	
	void add(int index, int val);
	
	int remove(int index);
}
