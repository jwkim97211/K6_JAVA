package com.ruby.java.ch04;

import java.util.Random;

public class Test37 {

	public static void main(String[] args) {
		Random rnd = new Random();           //난수 생성하기
		int [] score = new int[20];
		for(int i=0;i<score.length;i++) {
			score[i] = rnd.nextInt(20);
		}
		for(int num:score)
			System.out.print(num+" ");
			System.out.println();
		
		int sum=0;
		float avg=0;       // 소수점까지 보기 위해서 float
		int max =0;
		int min=20;        // 난수의 값들이 0~19이기 때문에 20으로 설정
		
		for(int i=0; i<score.length;i++) {
			sum+=score[i];
			if(max<score[i])
				max=score[i];
			if(min>score[i])
				min=score[i];
		}
		avg=sum/score.length;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
	}

}
