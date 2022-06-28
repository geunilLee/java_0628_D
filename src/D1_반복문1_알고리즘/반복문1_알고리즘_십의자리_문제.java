package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_십의자리_문제 {
	
	/*
	 * [문제]
	 *  9의 배수중 십의 자리가 6인 첫번째 배수 출력하시오.
	 *  답 : 63
	 */
	public static void main(String[] args) {
		
		int i = 1;
		int run = 1;
		while(run == 1) {
			if(i%9 == 0 && i/10 == 6) {
				System.out.println(i);
				run = 0;
			}			
			i+=1;
		}
		
	}
}