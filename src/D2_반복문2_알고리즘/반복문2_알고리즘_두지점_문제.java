package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_두지점_문제 {
	/*
	 * [문제]
		철수네 가족은 x 와 y 두지점을 자전거를 타고 왕복하였다. 
		갈때는 시속15km , 올때는 시속12km 로 이동하여 총  45분이 걸렸을때 , 
		두지점의 x , y 거리를 구하시오.
	 */
	public static void main(String[] args) {
		double x = 15/60.0;
		double y = 12/60.0;
		
		int t = 45;
		
		int a = t;
		int b = 0;
		
		int run = 1;
		while (run == 1) {
			if(x*a == y*b && a+b == t) {
				System.out.println("a 시간 : " + a);
				System.out.println("b 시간 : " + b);
				System.out.println("x 거리 : " + x*a);
				System.out.println("y 거리 : " + y*b);
				run = 0;
			}
			a-=1;
			b+=1;
		}
	}
}