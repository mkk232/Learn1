package com.koreait.exam.ch03;

import java.util.Random;

public class CardDeck {
	private Card[] cardArray;

	public static final String[] SHAPES = { "스페이드", "하트", "클로버", "다이아몬드" };

	public CardDeck() {
		super(); // 생략된것
		init();
	}

	private void init() {
		cardArray = new Card[52];

		final int CARD_MAX_LEN = 13;

		int idx = 0;
		for (int i = 0; i < SHAPES.length; i++) {
			for (int z = 1; z <= CARD_MAX_LEN; z++) {
				cardArray[idx++] = new Card(SHAPES[i], getNo(z));
			}
		}
	}

	public String getNo(int no) {
		switch (no) {
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			return Integer.toString(no);
		}
	}

	public void showCards() {
		for (Card c : cardArray) {
			System.out.println(c);
		}
	}

	public Card pick() {
		while (true) {
			// 0 ~ 51
			// 0.0 ~ 0.999999
//			int rIdx = (int)(Math.random() * 10); // 0 ~ 9 사이의 숫자 랜덤 출력
			int rIdx = (int) (Math.random() * 52); // 0 ~ 51 사이의 숫자 랜덤 출력
			Card c = cardArray[rIdx];

			if (c == null) {
				continue;
			} else {
				cardArray[rIdx] = null;
			}
			return c;
		}
	}
}
