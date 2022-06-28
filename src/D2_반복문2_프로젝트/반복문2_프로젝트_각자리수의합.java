package D2_반복문2_프로젝트;

import java.util.Random;

public class 반복문2_프로젝트_각자리수의합 {
	public static void main(String[] args) {
		
		/*
		 * [문제]
			 1~999 사이의 랜덤숫자를 저장하고 각 자리수의 합을 출력하시오.
			 예) 8 ==> 8
			 예) 28 ==> 2 + 8
			 예) 999 ==> 9 + 9 + 9
		 */
		Random ran = new Random();
		
		int run = 1;
		while(run == 1) {
			int r = ran.nextInt(999)+1;
			int a = r/100;
			int b = r%100/10;
			int c = r%10;
			System.out.println(r);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(a+b+c);
		run =0;
		}
		
	
	
	
	
	
	}
}