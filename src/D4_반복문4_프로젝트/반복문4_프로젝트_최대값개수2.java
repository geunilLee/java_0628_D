package D4_반복문4_프로젝트;

import java.util.Random;

public class 반복문4_프로젝트_최대값개수2 {
	public static void main(String[] args) {
		/*
		 * [문제] 
		 * 	랜덤으로 1~10 를 10번출력하고 , 
		 *  가장큰수가 여러번 나온경우 중복출력된 횟수출력하시오.
		 */
		Random ran = new Random();
		int count = 0;
		int a = 0;
		for(int i = 1; i<=10; i++) {
			int r = ran.nextInt(10)+1;
			System.out.println(r);
			if(a<r) {
				a = r;
				
			}
			else if(a == r) {
				count +=1;
			}
		}
		System.out.println("가장큰수 : " + a+ "    "+"중복횟수 : " + count );
	} 
}