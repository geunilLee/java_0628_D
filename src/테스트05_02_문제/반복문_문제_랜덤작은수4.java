package 테스트05_02_문제;

import java.util.Random;

public class 반복문_문제_랜덤작은수4 {
	public static void main(String[] args) {
		/*
		 * 	랜덤으로 100~200 사이의 숫자를 5개 출력한다. 
		 *  그중 가장 작은수를 출력한다.
		 *  작은수의 위치도 출력한다.
		 *  
		 *  [예] 
		 *  	112 114 145 176 119
		 *  [정답] 
		 *  	작은수 : 112
		 *  	위치 : 1
		 * 
		 */
		Random ran = new Random();
		int a = 300;
		int number = 0;
		for(int i= 1; i <= 5; i++) {
			int r = ran.nextInt(101)+100;
			System.out.println("위치 : " + i + "   " +"숫자 : " + r);
			if(a>r) {
				a=r;
				number = i ;
			}
			
		}
		System.out.println("최저숫자 위치 : " + number +"   "+"최저 숫자 : " + a);
	}
}