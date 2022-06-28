package 테스트05_04_문제;

public class 반복문_철수국왕 {
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
		int count = 0;
		int number = 0;
		for(int i = 1; i<=31; i ++) {
			//System.out.println(i);
			count += 1;
			number+=1;
			if(count == 1) {
				System.out.println(i + "일" + " 일요일");
			}
			else if(count == 2) {
				System.out.println(i + "일" + " 화요일");				
			}
			else if(count == 3) {
				System.out.println(i + "일" + " 수요일");				
			}
			else if(count == 4) {
				System.out.println(i + "일" + " 목요일");				
			}
			else if(count == 5) {
				System.out.println(i + "일" + " 금요일");				
			}
			else if(count == 6) {
				System.out.println(i + "일" + " 토요일");				
			}
			else if(count == 7) {
				System.out.println(i + "일" + " 일요일");				
			}
			
		}
		//System.out.println(number);
	}
}