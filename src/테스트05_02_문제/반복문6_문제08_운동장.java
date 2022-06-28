package 테스트05_02_문제;
/*  
	[문제]
		철수는 자전거로 운동장한바퀴도는데 70초, 민수는 90초가 걸린다. 
	    30분동안 운동장을 돌면 출발점에서 다시 만나는 횟수가 몇번인지 구하시오.
	[정답]
		다시 만나는 횟수 : 2
*/
public class 반복문6_문제08_운동장 {
	public static void main(String[] args) {
		
		
		int count = 0;
		int t = 1800;
		int a = 70;
		int b = 90;
		
		for(int i = 1; i <= 1800; i++) {
			
			if(i%a == 0 && i%b == 0) {
				System.out.println(i);
				count +=1;
			}
		}
		System.out.println("다시 만난횟수 : " + count);
	}	
}