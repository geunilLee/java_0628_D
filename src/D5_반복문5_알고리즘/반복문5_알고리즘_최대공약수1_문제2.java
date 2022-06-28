package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최대공약수1_문제2 {
	/*
	[문제] 
	
		6과 8의 공약수를 모두 출력
	
		 공약수란 위두수의 공통인약수를 말한다.
		 예)    
		 	6 의약수는 1, 2, 3, 6 이다.
		    8 의약수는 1, 2, 4, 8 이다.
		    
		 6과 8의 공약수는  1, 2 이다.
		 6과 8의 최대공약수는 2 이다.
*/
	
	public static void main(String[] args) {
		int i = 1;
		int a = 1;
		while(true) { 
			if(6%i == 0 && 8%i == 0) {
				if(a < i) {
					a = i;
					System.out.println(a);
					break;
				}
			}
			i+=1;
		}
		
	
	
		
	

	
	}
}