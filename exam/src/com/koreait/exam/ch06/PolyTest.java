package com.koreait.exam.ch06;

/*
 * 다형성
 * 1. 부모타입은 자식 객체 주소값을 저장할 수 있다 (참조할 수 있다.)
 * 2. 자식타입은 절대 부모 객체 주소값을 저장할 수 없다. (참조할 수 없다.)
 * 3. 타입은 메소드를 호출할 수 있냐 없냐만 결정 !
 * 		메소드가 호출이 된다면 객체 기준으로 실행 된다 !
 */
public class PolyTest {
	public static void main(String[] args) {
		Cat cat = new Cat("나비");
		
		cat.cry();
	}
}
