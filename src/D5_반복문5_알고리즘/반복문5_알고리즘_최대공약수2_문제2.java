package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최대공약수2_문제2 {
	
	/*
		[문제] 
			연필 42자루와 지우개 28개를 최대한 많은 학생에가 남김없이
	  	  	똑같이 나누어 주려고합니다. 몇명까지 나누어 줄수있는지 출력하시오.
	*/
	public static void main(String[] args) {

		int max = 0;
		for(int i = 1; i <= 42; i++) {
			if(42 % i == 0 && 28 % i == 0) {
				System.out.println(i);
				max = i;
			}			
		}
		System.out.println(max);	
	}
}