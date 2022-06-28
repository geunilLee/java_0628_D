package 테스트05_04_문제;

public class 반복문_철수국왕2 {
	public static void main(String[] args) {
		/*
			철수는 무인도를 사들여 국왕이 되었다.
			철수는 평소 월요일을 싫어해서 주7일을 주6일로 바꾸고 월요일을 삭제했다.
			5월1일이 일요일일하고할때, 
			5월1일부터 5월31일까지 날짜와 요일을 전부 출력해보자.
			
			 
			 [예시]
			 	1 => 일
			 	2 => 화
			 	3 => 수
			 	4 => 목
			 	5 => 금
			 	6 => 토
			 	7 => 일
			 	8 => 화
			 	.......
		 */
		int week = 0;
		for(int i = 1; i <= 31; i++ ) {
			week +=1;
			
			if(week%6 == 0) {				
				System.out.println(week+" => 토");
			}
			if(week%6 == 1) {				
				System.out.println(week+" => 일");
			}
			if(week%6 == 2) {				
				System.out.println(week+" => 화");
			}
			if(week%6 == 3) {				
				System.out.println(week+" => 수");
			}
			if(week%6 == 4) {				
				System.out.println(week+" => 목");
			}
			
			
		}
		
	}
}