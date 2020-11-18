package com.koreait.exam.ch05;

public class MyArrayList implements MyList {
	private int[] arr;

	public MyArrayList() {
		arr = new int[0];
	}

	@Override
	public int size() {
		int[] tmp = new int[arr.length];
		int cnt = 0;
		for(int i = 0; i < tmp.length; i++) {
			cnt++;
		}
		return cnt;
	}

	@Override
	public void add(int val) {
		int[] tmp = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		tmp[arr.length] = val;

		arr = tmp;
	}

	@Override
	public void add(int index, int val) {
		int[] tmp = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			if (i < index) {
				tmp[i] = arr[i];
			} else {
				tmp[i + 1] = arr[i];
			}

//			tmp[i < index ? i : i+1] = arr[i];
		}
		tmp[index] = val;

		arr = tmp;
	}

	@Override
	public int remove(int index) {
		int delVal = arr[index];
		int[] tmp = new int[arr.length - 1];

		for (int i = 0; i < tmp.length; i++) {

			if (i < index) {
				tmp[i] = arr[i];
			} else {
				tmp[i] = arr[i + 1];
			}
//			tmp[i] = arr[i < index ? i : i+1];
		}
		arr = tmp;
		return delVal;
	}

	public void showMyArr() {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d : %d\n", i, arr[i]);
		}
	}
}
