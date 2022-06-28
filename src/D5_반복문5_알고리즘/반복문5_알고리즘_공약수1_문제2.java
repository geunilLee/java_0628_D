package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_공약수1_문제2 {
	/*
	 * [문제]
	   		105와 63과 175의 공약수를 구하시오
	 */
	public static void main(String[] args) {
		int i = 1;
		while(i < 10) {
			
			if(105%i == 0 && 63%i == 0 && 175%i == 0 ) {
				System.out.println(i);
			
			}
			i+=1;			
		}		
			
			
		
	}
}