package 테스트05_02_문제;

public class 반복문_문제_건물주3 {
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
		int count = 0;
		for(int i = 1; i<=50; i ++) {
			 count = count +1;
			 
			int a = count/10;// 10 20 30 40 50  
			int b = count%10; //  1 23 4 5 6 7 89 
			System.out.println(count);
			if(a == 4) {
				count+=10;
			}
			if(b == 4) {
				count +=1; 
			}
			System.out.println(count);
			System.out.println();
		}
		
		
	}
}
