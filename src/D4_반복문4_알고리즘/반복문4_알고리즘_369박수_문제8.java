package D4_반복문4_알고리즘;

import java.util.Random;

public class 반복문4_알고리즘_369박수_문제8 {
	/*
	 * 
	 *  [369게임]
	 * 1. 1~50까지 반복을 한다. for 50회
	 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
	 * 
	 * 3. 각각의 숫자에 3이나 6이나 9가 두개 면 "짝짝" 몇의 자리가 3이거나 6이거나 9이면 카운트 1 (변수) 
	 * 4. 각각의 숫자에 3이나 6이나 9가 한개 면 "짝"
	 * 5. 3이나 6이나 9가 없으면 그냥 숫자출력    (없으면 그냥 출력) 
	 * 
	 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		
		
		int s = 1;
		for(int i = 1; i <= 999; i ++) {
			int count = 0;
			int a = s%100/10;
			int b = s%10;
			int c = s/100;
			if(a == 3 || a == 6 || a == 9) {
				count +=1;
			}
			if(b == 3 || b == 6 || b == 9) {
				count +=1;
			}
			if(c == 3 || c == 6 || c == 9) {
				count +=1;
			}
			else {
				System.out.println(s);
			}
			
			if(count == 3) {
				System.out.println("짝짝짝");
			}
			else if(count == 2) {
				System.out.println("짝짝");
			}
			else if(count == 1) {
				System.out.println("짝");
			}
			s+=1;
		}
	}

}