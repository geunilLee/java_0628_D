package D3_반복문3_프로젝트;

import java.util.Random;

public class 반복문3_프로젝트_랜덤점수통계_문제5 {
	/*
	 * [랜덤점수통계]
	 * 
	 * 1. 10회 반복을 한다. for
	 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적) ran
	 * 3. 성적이 60점 이상이면 합격생이다. 조건문+ count
	 * ---------------------------------------
	 * . [1] 전교생(10명)의 총점과 평균을 출력한다. 변수 a x 
	 * . [2] 합격자 수를 출력한다.x
	 * . [3] 1등 학생의 번호와 성적을 출력한다. number x
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		
		int count = 0;
		int number = 0;
		int a = 0;
		
		for(int i = 1 ; i <= 10; i ++) {
			int r = ran.nextInt(100)+1;
			number = i;
			System.out.println("번호 : " + number +"    "+"점수 : " + r);
						
			if(r >= 60) {
				count +=1;
			}
			if(a <= r){				
				a += r;
			}
		}
		System.out.println("------------------------------");
		System.out.println("총점 : " + a);
		System.out.println("평균 : " + (a/10.0));
		System.out.println("합격자수 : " + count);
		
	}

}