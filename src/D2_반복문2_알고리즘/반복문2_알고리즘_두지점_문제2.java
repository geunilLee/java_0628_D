package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_두지점_문제2 {
	/*
	 * [문제]
		철수네 가족은 x 와 y 두지점을 자전거를 타고 왕복하였다. 
		갈때는 시속 15km , 올때는 시속 12km 로 이동하여 총  45분이 걸렸을때 , 
		두지점의 x , y 거리를 구하시오.
	 */
	public static void main(String[] args) {
		double x = 15/60.0;
		double y = 12/60.0;
		int t = 45;
		int a = t;
		int b = 0; 
		int run = 1;
		while(run == 1) {
			if(x*a == y*b && a+b == t) {
				
				System.out.println(x*a + " " + y*b);
			}
			a--;// 시간안에 거리에 시간을 곱해 답을 찾는다
			b++;
		}
		
	}
}
