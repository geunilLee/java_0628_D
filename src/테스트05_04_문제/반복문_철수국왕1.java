package 테스트05_04_문제;

public class 반복문_철수국왕1 {
	public static void main(String[] args) {
		/*
		 * 철수는 무인도를 사들여 국왕이 되었다. 철수는 평소 월요일을 싫어해서 주7일을 주6일로 바꾸고 월요일을 삭제했다. 5월1일이
		 * 일요일일하고할때, 5월1일부터 5월31일까지 날짜와 요일을 전부 출력해보자.
		 * 
		 * 
		 * [예시] 1 => 일 2 => 화 3 => 수 4 => 목 5 => 금 6 => 토 7 => 일 8 => 화 .......
		 */

		int a = 0;
		int week = 0;
		int i = 1;
		while (i <= 31) {
//			System.out.println(i);
	//		System.out.println(i + "일");

			a += 1;
			while(true) {
				if (a % 6 == 0) {
				week = a;

				if (week == 1) {
					
					System.out.println(i +" => 일 ");
				}
				if (week == 2) {
					System.out.println(i +" => 화 ");
				}
				if (week == 3) {
					System.out.println(i +" => 수 ");
				}
				if (week == 4) {
					System.out.println(i +" => 목 ");
				}
				if (week == 5) {
					System.out.println(i +" => 금 ");
				}
				if (week == 6) {
					System.out.println(i +" => 토 ");
				}
				if (week == 7) {
					System.out.println(i +" => 일 ");
				}
				if(i >= 31) {
				
					
			}
				a+=1;
				
			}
			
		}

	}
}}