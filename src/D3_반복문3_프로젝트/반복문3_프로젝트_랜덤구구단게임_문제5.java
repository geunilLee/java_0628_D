package D3_반복문3_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 반복문3_프로젝트_랜덤구구단게임_문제5 {
	/*
	 * 
	 *  [랜덤구구단 게임] (반복문사용)
	 * 1. 랜덤구구단 게임을 10회 반복한다.
	 * 2. 정답을 맞추면 1문제당 10점이다.
	 * 3. 게임 종료 후, 성적을 출력한다.
	 * 4. 단, 3번연속으로틀리면 즉시종료하며 0점이된다.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int s =0;
		for(int i = 1; i<=10; i ++) {
			int a = ran.nextInt(9)+1;
			int b = ran.nextInt(9)+1;
			int c = a*b;
			
			System.out.printf ("%d * %d =", a,b);
			int sel = scan.nextInt();
			if(c == sel) {
				System.out.println("정답");
				count +=10;
			}
			else {
				System.out.println("오답");
				s+=1;
				if (s == 3){
					System.out.println("3회 연속 오답 종료");
					break;
				}
			}
			
		}
			System.out.println("점수 : " + count);
		}
		
}