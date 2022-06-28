package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최소공배수2_문제5 {
	/*
	 * [문제]
	   	철수와 민수는 같은 수영장에 다닌다
	   	철수는 4일마다 한번씩 가고 민수는 5일만다한번씩 간다.
	   	
	   	철수와 민수가 2월 3일날 처음만났다면 다음에 서로 만나는 날은 언제인가?
	   	
	 */
	public static void main(String[] args) {
		// 배스로 게산하기가 어려운관계로 한번씩 돌때마다 더해주는방식으로 식의 방향을 선택
		int a = 4;
		int b = 5;
		int start = 3;
		int i = 1;
		
		int num1 = a;
		int num2 = b;// 변수 오류 방자하기위해 한번더 저장
	
		
		while(true) {	
			if(num1<num2) {
				num1+=4;
			}
			else if(num1>num2) {
				num2+=5;
			}
			else if(num1 == num2) {
				System.out.println((i+start));
				break;
			}
			i+=1;	
			
		}
		
	}
}
