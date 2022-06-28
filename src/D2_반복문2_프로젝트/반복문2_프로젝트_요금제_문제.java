package D2_반복문2_프로젝트;

public class 반복문2_프로젝트_요금제_문제 {
	/*
	 * [문제]
		  아래와같은 휴대요금제가 있다 
		  B를 선택할경우 A보다 더 경제적이될려면,
		  통화시간을 얼마까지 사용해야될까요? 
		  정답을 초로 구하시오.
		  A요금제 기본요금 17500원 초당 5원 
		  B요금제 기본요금 31000원 초당 2원
	      기본사용량은 제공되지않는다. 
	      
	 */
	/*
	 b>a
	 run =0;
	 
	 x*a
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		int a요금제 = 17500;
		int b요금제 = 31000;
		
		int t = 1;
		int a = 5;
		int b = 2;
		int count = 0;
		
		
		int run = 1;
		while(run == 1) {
			if(a*t >= b요금제) {
				System.out.println(a);			
				System.out.println(" a 초 : " + t);
				System.out.println(a*t);
				
				run = 0;
			}
			t++;	
			}
		
		run = 1;
		while(run == 1) {
			if(b*t>= b요금제) {
				System.out.println(b);			
				System.out.println(" b 초 : " + t);
				System.out.println(b*t);
				run = 0;
			}
			
			t++;
	}
}}