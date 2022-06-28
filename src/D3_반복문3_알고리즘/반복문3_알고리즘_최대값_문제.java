package D3_반복문3_알고리즘;

import java.util.Scanner;

public class 반복문3_알고리즘_최대값_문제 {
	/*
	 * 	[최대값 구하기]
	 * 1. 반복문안에서 계속해서 값을 입력받는다. ( -1000 보다큰수만입력받는다.)
	 * 2. 입력받은숫자중 가장큰숫자를 출력한다.
	 * 3. -1000 보다 이하를  입력하면 종료한다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int a = 0;
		
		int run = 1;
		while(run == 1) { 
			System.out.println("숫자입력");
			int sel = scan.nextInt();
			if(a<sel) {
				a = sel;
			}		
			if(sel <= -1000) {
				System.out.println("종료");
				run = 0;
			}
		}
		System.out.println(a);
		}
		
	}


