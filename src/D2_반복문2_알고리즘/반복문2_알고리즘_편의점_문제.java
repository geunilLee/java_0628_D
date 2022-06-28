package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_편의점_문제 {
	/*
	 * [문제]
		철수가 편의점의 한개에 1000원인 흰우유와 한개에 1200원인 초코우유를 몇개 사서 
		총 15개의 우유를 샀다.
		20000원을 내고 4200원을 거슬러받았을때 철수가산 흰우유는 몇개인가요??
	 */	
	public static void main(String[] args) {
		int w = 1000;
		int c = 1200;
		int 총요금 = 20000-4200;
		
		int max = 15;
		int a = max;
		int b = 0;
		
		
		int run = 1;
		while(run == 1) {
			if(w*a + c*b == 총요금 && a+b == max){
				System.out.println("힌우유 : " + a);
				System.out.println("초코우유 : " + b);
				run = 0;
			}
			a-=1;
			b+=1;
		}
		
		
	}
}