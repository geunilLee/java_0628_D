package D1_반복문1_기본이론;

import java.util.Scanner;

public class 반복문1_기본이론4_종료 {
	/*
		   [반복문 종료]
		  1. 무한 반복을 하면서 숫자를 입력받는다.
		  2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
		  예)
		  숫자 입력[EXIT:-100] : 1
		  숫자 입력[EXIT:-100] : 3
		  숫자 입력[EXIT:-100] : 4
		  숫자 입력[EXIT:-100] : -100
		  프로그램 종료
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int run = 1;
		while (run == 1) {
			System.out.println("숫자 입력[EXIT:-100] : ");
			int sel = scan.nextInt();
			if(sel == -100) {
				System.out.println("종료");
				run = 0;
			}
		}
	}
}