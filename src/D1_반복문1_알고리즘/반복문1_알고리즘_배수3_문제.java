package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_배수3_문제 {
	/*
	 * [문제] 
		  50에서 100까지 자연수중에서 9의 배수의 개수를 출력하시오.
		  [예] (54,63,72,81,90,99)  6 개 
	 */
	
	public static void main(String[] args) {
		int i = 50;
		int run = 1;
		int count = 0;
		int start = 50;
		int max = 100;
		
		while(run == 1) {
			if(i <= max) {			
			
				if(i >= start) {
					if(i%9 ==0) {
						count +=1;
						System.out.println ("숫자 : " + i);
						System.out.println();
						System.out.println("갯수 : "+count);					
					}
					
				}			
			i+=1;
			
			}
		}
		
	}
}