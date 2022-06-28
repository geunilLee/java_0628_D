package D3_반복문3_프로젝트;

import java.util.Random;

public class 반복문3_프로젝트_랜덤점수통계_문제4 {
	/*
	 * [랜덤점수통계]
	 * 
	 * 1. 10회 반복을 한다.
	 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
	 * 3. 성적이 60점 이상이면 합격생이다.
	 * ---------------------------------------
	 * . [1] 전교생(10명)의 총점과 평균을 출력한다.
	 * . [2] 합격자 수를 출력한다.
	 * . [3] 1등 학생의 번호와 성적을 출력한다.
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		int a = 0;
		int count = 0;
		int 컷트라인 = 60;
		double 학생수 = 10;
		for(int i = 1; i<=10; i ++) {
			int r = ran.nextInt(100)+1;
			System.out.println("점수 : " + r);
			a += r;						
			if(r >= 컷트라인) {
				System.out.println("합격");
				count +=1;				
			}
			else {
				System.out.println("불합격");
			}
			
		}
		System.out.println("총점 : " + a);
		System.out.println("평균 : " + (a/학생수));
		System.out.println("합격자수 : " + count);
		
	}

}