package D2_반복문2_프로젝트;

public class 반복문2_프로젝트_요금제_문제1 {
	/*
	 * [문제]
		  아래와같은 휴대요금제가 있다 
		  B를 선택할경우 A보다 더 경제적이될려면,
		  통화시간을 얼마까지 사용해야될까요? 
		  정답을 초로 구하시오.
		  A요금제 기본요금 17500원 초당 5원 
		  B요금제 기본요금 31000원 초당 2원
	      기본사용량은 제공되지않는다. 
	      
	      a>=b
	      
	 */
	public static void main(String[] args) {
		int a기본요금 = 17500;
		int b기본요금 = 31000;
		
		int a = 5;
		int b = 2;
		
		int t = 1;
		int run = 1;
		while(run == 1){
			if(a기본요금 + a*t > b기본요금 + b*t ) {
				System.out.println(a기본요금 + a*t);
				System.out.println(b기본요금 + b*t);
				System.out.println(t + " 초");
				run = 0;
			}
			
			
			t+=1;
			
		}
	}
}