package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_배수2_문제1 {

	/*
	 * [문제]
	 *  8의 배수를 작은수부터 3개 출력하시오. 
	 *  답 : 8,16,24
	 */
	
	public static void main(String[] args) {
		
		int i = 1;
		int count = 0;
		
		int run  = 1;
		while(run == 1) {
			if(i%8 == 0) {
				System.out.println(i);
				count +=1;
			}
			if(count == 3) {
				run = 0;
			}			
			i+=1;		
		}
	}
}