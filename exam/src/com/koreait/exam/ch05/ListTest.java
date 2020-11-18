package com.koreait.exam.ch05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(); // 상속관계 List가 부모
//		List는 인터페이스, 인터페이스 기능만 있고 구현되어 있지않음.
//		배열로 구성되어 있음
		
//		List<Integer> list = new LinkedList<>(); // ArrayList처럼 List를 상속받는 2개중 한개.
//		 수정이 잦음. 수정과 제거 등 변경이 많을때
		
//		제네릭. <Card> 화장실임. 들어가는게 남자 여자 강아지 등등 하지만 나오는것은 누가될지 모름. 그래서 제네릭이 필요함
		
		list.add(1);
		list.add(2);
		list.add(30);
		list.add(4);
		
		list.add(1, 100); // 1번 인덱스 자리에 100을 넣는게 아니라. 한칸씩 밀어서 중간에 삽입하는것이다. 인덱스가 한칸씩 늘어난다.
		
		int delVal = list.remove(0); // 인덱스가 한칸씩 줄어듦. 지우면서 리턴까지 해준다.
		
		System.out.println("delVal : " + delVal);
		
//		list는 기본적으로 object임. 그래서 int형으로 변환해주는것이다.
		
		for(int i = 0; i < list.size(); i++) {
			int val = list.get(i); // 타입을 Object로 하면 에러가 나지 않지만 int형으로 받으려면 int형으로 변환해준다. // 제네릭쓰면 생략할수있음
			
			System.out.println(val);
		}
		
	}
}
