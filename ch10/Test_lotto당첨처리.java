package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Test_lotto당첨처리 {

	public static void main(String[] args) {

		lotto_generator(1000);

	}

	public static void lotto_generator(int n) {
		Random number = new Random();
		List<HashSet<Integer>> lotSet = new ArrayList<>();
		HashSet<Integer> lotto = null;

		for (int i = 0; i < n; i++) {
			lotto = new HashSet<>();
			for (int j = 0; lotto.size() < 6; j++) {
				lotto.add(1 + number.nextInt(45));
			}
			lotSet.add(lotto);
		}
		System.out.println("\nlot hashset을 출력\n");
		for (HashSet<Integer> eachLotto : lotSet) {
			System.out.println(eachLotto.toString());
		}

		HashSet<Integer> win = new HashSet<>();
		for (int j = 0; win.size() < 6; j++) {
			win.add(1 + number.nextInt(45));
		}
		int bonus = 1 + number.nextInt(45);
		while (win.contains(bonus)) {
			bonus = 1 + number.nextInt(45);
		}
		System.out.print("당첨번호 : " + win + "보너스번호 : " + bonus);
		System.out.println();
		winnerLotto(win, bonus, lotSet);

	}

	static void winnerLotto(HashSet<Integer> w, int bonus, List<HashSet<Integer>> lotSet) {
		for (int i = 0; i < lotSet.size(); i++) {
			checkWinner(w, bonus, lotSet.get(i));
		}
	}

	static void checkWinner(HashSet<Integer> w, int bonus, HashSet<Integer> elem) {
		int count = 0;
		for (int i : w) {
			if (elem.contains(i)) {
				count++;
			}
		}

		switch (count) {
		case 0:
		case 1:
		case 2:
			System.out.println("꽝");
			break;
		case 3:
			System.out.println("5등 복권 " + elem + " 당첨번호:" + w);
			break;
		case 4:
			System.out.println("4등 복권 " + elem + " 당첨번호:" + w);
			break;
		case 5:
			if (elem.contains(bonus)) {
				System.out.println("2등 복권 " + elem + " 당첨번호:" + w);
				break;
			} else {
				System.out.println("3등 복권 " + elem + " 당첨번호:" + w);
				break;
			}

		case 6:
			System.out.println("1등 복권 " + elem + " 당첨번호:" + w);
			break;
		}

	}
}