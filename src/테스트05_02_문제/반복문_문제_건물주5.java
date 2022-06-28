package 테스트05_02_문제;

public class 반복문_문제_건물주5 {
	public static void main(String[] args) {
		/*
		 * 철수는 산전수전 끝에 50층 빌딩의 건물주가 되었다. 
		 * 철수는 빌딩의 엘리베이터에서 숫자4를 전부 제거 했다. 
		 * 만약에 실제로 4층을 간다면 숫자 5를 눌러야한다. 
		 * 철수의 빌딩은 지상1층에서 지상50층이고 , 실제 엘리베이터에 적혀있는 숫자를 1층부터 순서대로 출력하시오. 
		 * [예]
		 * 		1 2 3 5 6 7 8 9 10 11 12 13 15 .... 66
		 * 
		 */
		int c = 0;
		for(int i = 1; i<= 50; i++) {
			c=c+1;
			int a = c/10;
			int b = c%10;
			if(a == 4) {
				c+=10;
			}
			if(b == 4) {
				c+=1;
			}
			System.out.println(c);
		}
	}
}