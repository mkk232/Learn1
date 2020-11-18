package com.koreait.exam.mission;

public class Gugudan {
	public static void main(String[] args) {
//		gugudan(4,8); 
//		4 * 1 = 4 
//		단이 바뀔땐 ----
		
		for(int i = 4; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i*j);
			}
			System.out.println("-------------");
		}
	}
}
