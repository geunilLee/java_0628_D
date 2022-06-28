package D3_반복문3_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 반복문3_알고리즘_업다운게임_문제 {
	/*
	 *  [Up & Down 게임]
	 * 1. com 은 랜덤으로 1~100사이를 저장한다.
	 * 2. me 는 1~100사이를 입력한다. 	 
	 * 3. com 과 me 를 비교해서 com 크면 "크다" , 
	 * 	  com 이작으면 "작다" 힌트제공 
	 * 4. 정답을 맞추면 게임은 종료된다.
	 */

	public static void main(String[] args) {
		Random ran =new Random();
		Scanner scan = new Scanner(System.in);
		int r = ran.nextInt(100)+1;
		int run = 1;
		while(run == 1) {
			
			System.out.println("숫자입력");
			int sel = scan.nextInt();
			if(r<sel) {
				System.out.println("down");
			}
			else if(r>sel) {
				System.out.println("up");
				//System.out.println(r);
			}
			else if(r == sel ) {
				System.out.println("정답");
				System.out.println(r);
				run = 0;
			}
			
			
		}
	}

}