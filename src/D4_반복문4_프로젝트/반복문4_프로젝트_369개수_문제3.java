package D4_반복문4_프로젝트;

import java.util.Random;

public class 반복문4_프로젝트_369개수_문제3 {
	/*
	 * [369게임]
	  
		  1~ 10000 사이의 숫자를 입력받고 
		  3이나 6이나 9의  개수출력하시오.
	 
		  예) 9999 ==> 4
		  예) 36 ==> 2
		  예) 1 ==> 0
		  예) 222 ==> 0  
	 */
	public static void main(String[] args) {
		
		Random ran = new Random();
		int r = ran.nextInt(10000)+1;
		int temp = r;
		int count = 0;
		while(true) {
			System.out.println(temp);
			int a = temp%10;
			if(a == 3 || a == 6 || a == 9) {
				count+=1;
			}
			
			
			
			temp = temp/10;
			if(temp == 0) {
				break;
			}
		}
		System.out.println("----------------");
		System.out.println(count+" 개 ");
	}
}
