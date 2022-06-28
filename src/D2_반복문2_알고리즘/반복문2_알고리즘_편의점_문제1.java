package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_편의점_문제1 {
	/*
	 * [문제]
		철수가 편의점의 한개에 1000원인 흰우유와 한개에 1200원인 초코우유를 몇개 사서 
		총 15개의 우유를 샀다.
		20000원을 내고 4200원을 거슬러받았을때 철수가산 흰우유는 몇개인가요??
	 */	
	public static void main(String[] args) {
		
		
		
		/*
		 흰우유 = 1000;
		 초코우유 = 1200;
		 a+b=15
		 a*c+b*d = 15800;
		 
		 
		 */	
		
		int white = 1000;
		int choco = 1200;
		
		int money = 15800;
		int total = 15;
		
		
		int c = total;
		int d = 0;
		
		int run = 1;
		while(run == 1) {
			if(white*c + choco*d == money && c+d == total ) {
				System.out.println("흰 우유 가격 : " + white);
				System.out.println("힌 우유 갯수 : " + c);
				System.out.println("초코 우유 갯수 : " + d);
				System.out.println("철수가 산 흰 우유 가격 : " + white*c);
				break;
			}			
			c-=1;
			d+=1;
		}
	}
}