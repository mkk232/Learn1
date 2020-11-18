package com.koreait.exam.ch03;

public class CardTest3 {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();

		for (int i = 0; i < 52; i++) {
			System.out.println(cd.pick());
		}
		
//		System.out.println(card1);
		System.out.println("---------");
		cd.showCards();
		// cardArray에 52장을 저장할 수 있게 공간 마련
		// card 52장을 만들어서 각 방에 넣어주기.

//		int[] intArr2 = new int[5];
//		intArr2[0] = 1;
//		intArr2[1] = 2;
//		intArr2[2] = 3;
//
//		int[] intArr = { 1, 2, 3, 4, 5 };
//
//		Card[] cardArr = new Card[52];
//
//		System.out.println(cardArr[0]);
//		final int CARD_MAX_LEN = 13;

//		String[] shape = { "스페이드", "하트", "클로버", "다이아몬드" };
//		char[] no = {'A', (int)50, (int)51, (int)52,(int)53,(int)54,(int)55,(int)56,(int)57, 'J', 'Q', 'K'};
//		for(int i = 0; i < shape.length; i++) {
//			for(int z = 0; z < no.length; z++) {
//				System.out.println(shape[i] + " : " + no[z]);
//			}
//		}
//		int idx = 0;
//		for (int i = 0; i < shape.length; i++) {
//			for (int z = 1; z <= CARD_MAX_LEN; z++) {
//				String no = null;
//				switch (z) {
//				case 1:
//					no = "A";
//					break;
//				case 11:
//					no = "J";
//					break;
//				case 12:
//					no = "Q";
//					break;
//				case 13:
//					no = "K";
//					break;
//				default:
//					no = Integer.toString(z);
//				}
//				cardArr[idx++] = new Card(shape[i], no);
//			}
//
//			for (int j = 0; j < cardArr.length; j++) {
//				System.out.println(cardArr[j]);
//			}
//		}

	}
}
