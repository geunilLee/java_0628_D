package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_세자리수_문제 {
	
	/*
	 * [문제]
	 *  28의 배수 중에서 가장 큰 세자리 수를 출력하시오.
	 *  답 : 980 
	 */
	public static void main(String[] args) {
		
		int i = 1;
		int run = 1;
		int max = 1000;
		int a = 0;
		while (run == 1) {
			if(i <= max) {
				if(i%28 == 0) {
					if(a <= i) {
						a = i;
					}						
				}					
			}			
			else {
				run = 0;
			}			
			i+=1;
		}
		System.out.println(a);
		
	}
}
		
