package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최대공약수2_문제3 {
	/*
		[문제] 
			연필 42자루와 지우개 28개를 최대한 많은 학생에가 남김없이
	  	  	똑같이 나누어 주려고합니다. 몇명까지 나누어 줄수있는지 출력하시오.
	 */
	public static void main(String[] args) {
		int a = 0;
		int b = 42;
		int c = 28;
		
		int i = 1;
		while(true) {
			if(b%i== 0 && c%i == 0) {
				System.out.println(i);
//					if(a <= i) {
//						a = i;						
//					}
			}
			i+=1;
			//System.out.println(a);
		}
		
	}
}