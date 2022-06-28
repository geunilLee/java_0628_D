package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_배수1_문제 {
	/*
	 * [문제] 
	 * 	7의 배수중  150보다 작은수중 가장큰수 출력하시오. (어떤 수의 배수는 그 수에 정수를 곱한 수이다.) 
	 *  답 : 147
	 */
	public static void main(String[] args) {
		int i = 1;
		while (i <= 150 ) {
			if(i%7 == 0) {
				System.out.println(i);
			}
			i+=1;
			
		}
		
	}
}