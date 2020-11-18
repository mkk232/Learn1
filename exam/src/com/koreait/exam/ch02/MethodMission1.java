package com.koreait.exam.ch02;

public class MethodMission1 {
	public static void main(String[] args) {
//		printStarSqure(5);
//		printStarTri(10);
		printStarRevTri(10);
	}
	
	public static void printStarRevTri(int n1) {
		for (int i = n1; i >= 0; i--) {
			printStar(i);
		}
	}
	
	public static void printStarTri(int n1) {
		for(int i = 1; i <= n1; i++) {
			printStar(i);
		}
	}

	public static void printStarSqure(int n1) {
		for (int i = 0; i < n1; i++) {
			printStar(n1);
			System.out.println();
		}
	}
	

	public static void printStar(int n1) {
		for (int i = 0; i < n1; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
