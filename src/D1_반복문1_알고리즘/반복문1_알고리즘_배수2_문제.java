package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_배수2_문제 {

	/*
	 * [문제]
	 *  8의 배수를 작은수부터 4개 출력하시오. 
	 *  답 : 0,8,16,24
	 */
	
	public static void main(String[] args) {
		int run = 0;
		int count = 0;
		int i = 1;
		while(i == 1) {
			if(run%8 == 0) {
				System.out.println(run);
				count+=1;
			}
			if(count == 4) {				
				i = 0;
			}
			
			run +=1;
			
		}
		
	}
}