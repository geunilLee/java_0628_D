package D3_반복문3_프로젝트;

import java.util.Random;

public class 반복문3_프로젝트_랜덤점수통계_문제 {
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
		int count = 0;
		int max = 0;
		int number = 0;
		int total = 0;
		for(int i = 1; i <= 10; i ++) {
			int r = ran.nextInt(100)+1;
			
			if(r >= 60){
				System.out.println(i + "번 학생 학생합격 : " + r + "점");
				count +=1;
			}
			else {
				System.out.println(i + "번 학생 학생불합격 : " + r + "점");
			}
			if(max < r) {
				max = r;
				number = i;
			}
			total = total + r;
		}
		System.out.println("총점 : "+ total + "평균 : " + total/10.0 );
		System.out.println("합격자수 : " + count);
		System.out.println("1등 합격자 번호 : " + number + "번" + "성적 : " + max);
	}

}