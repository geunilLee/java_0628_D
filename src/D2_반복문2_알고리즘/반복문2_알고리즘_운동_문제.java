package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_운동_문제 {
	/*
	 * [문제]
	 * 철수는 저녁 6시에 30분에  집에서 3km 떨어진 공원을 가는데,
	 * 처음에는 시속 3km로 걷다가 도중에 시속 6km로 달려갔다.
	 * 철수는 공원에 7시  10분 에도착했다.
	 * 걸어간 거리와 달려간 거리를 구하시오.

         실수는 정확하게 계산이 안될수도 있기때문에 주석으로만 푸시오.
         /*
          
              
              
              
          */
         

	public static void main(String[] args) {
		double x = 3/60.0;
		double y = 6/60.0;
		
		int 시간 = 40;
		int 거리 = 3;
		
		int a = 시간;
		int b = 0;
		int run = 1;
		while(run == 1) {
			if(x*a + y*b == 거리 && a+b == 시간) {
				System.out.println(a);
				System.out.println(b);
				System.out.println("시속3 : " + a*x);
				System.out.println("시속6 : " + b*y);
				run = 0;
				
			}
			
			a-=1;
			b+=1;
			
			
		}
	}
}