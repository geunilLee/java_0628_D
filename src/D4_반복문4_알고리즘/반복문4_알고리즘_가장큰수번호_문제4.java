package D4_반복문4_알고리즘;

import java.util.Random;

public class 반복문4_알고리즘_가장큰수번호_문제4 {
	/*
	  [문제1] 반복문을 사용하여 랜덤숫자 1~9 을 5번출력한다. 
	       1) 랜덤숫자중  가장큰수와 번호를 출력
             (번호는 출력순서이다.)
	       2) 가장큰수가 여러개있다면 가장첫번째 번호를 출력 
	      예) 
	      		1, 7, 4, 7, 5 ==>   가장큰수 : 7 ,  번호 : 2  
	         	가장큰수가 2개지만 첫번째번호를 출력

	  [문제2] 반복문을 사용하여 랜덤숫자 1~9 을 5번출력한다. 
	       1) 랜덤숫자중  가장큰수와 번호를 출력
             (번호는 출력순서이다.)
	       2) 가장큰수가 여러개있다면 가장마지막 번호를 출력 
	      예) 
	      		1, 7, 4, 7, 5 ==>   가장큰수 : 7 , 번호 : 4  
	      		가장큰수가 2개지만 마지막 번호를 출력
   */
	public static void main(String[] args) {
		Random ran = new Random();
		int a = 0;
		int number = 0;
		for(int i = 1; i <= 5; i++) {
			int r = ran.nextInt(3)+1;
			System.out.println(i+"번"+"    "+ "램덤 숫자"+r);
				
			if(a < r) {
				a = r; number = i;
				
				//System.out.println(number+"번"+"    " + "최고 숫자경신 : " + a);
			}
		}
		System.out.println(number+"번"+"    " + "최고 숫자 : " + a);
		
	} 
}