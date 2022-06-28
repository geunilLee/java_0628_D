package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_두지점_정답 {
	/*
	 [문제]
	 
		철수네 가족은 x 와 y 두지점을 자전거를 타고 왕복하였다. 
		갈때는 15km , 올때는 시속12km 로 이동하여 총  45분이 걸렸을때 , 
		두지점의 x , y 거리를 구하시오.
	 */
	public static void main(String[] args) {		
	
	
		double 자전거1 = 15/60.0;
		double 자전거2 = 12/60.0;
		
		int 총시간 = 45;
		int b = 총시간;
		int c = 0;
		
			
		int run = 1;
		while(run == 1) {
			if(자전거1 * b == 자전거2 * c && b + c == 총시간) {
				System.out.println(b + " " + c);
				System.out.println("거리 : " + 자전거1 * b);
                run = 0;
			}
			b -= 1;
			c += 1;
		}

	}
}