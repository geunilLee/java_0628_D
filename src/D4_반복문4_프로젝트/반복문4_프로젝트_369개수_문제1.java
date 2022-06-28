package D4_반복문4_프로젝트;

import java.util.Scanner;

public class 반복문4_프로젝트_369개수_문제1 {
	/*
	 * [369게임]
	  
		  1~ 10000 사이의 숫자를 입력받고 
		  3이나 6이나 9의  개수출력하시오.
	 
		  예) 9999 ==> 4
		  예) 36 ==> 2
		  예) 1 ==
		  예) 222 ==> 0> 0  
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int i = 1;
		while (i <= 10000) {
			System.out.println("1~1000사이 숫자를 입력하시오.");
			int sel = scan.nextInt();
			if(sel%10 == 3 || sel%10 == 6 || sel%10 == 6)
			System.out.println(sel);
	
			
		}
		
	}
}