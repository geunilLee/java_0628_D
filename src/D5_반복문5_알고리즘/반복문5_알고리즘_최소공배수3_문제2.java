package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최소공배수3_문제2 {
	/*
	   	[문제] 
	   		자전거로 운동장을 한바퀴도는데 철수는 90초 , 영희 는 60초 , 민수는 45초가 걸립니다.
	   		이와같은 속력으로 같은곳에서 동시에 출발하여 같은 방향으로 운동장을 돌때, 
	   		1) 세사람이 처음으로 출발점에서 다시만나게되는것은 몇초뒤입니까?
	   		2) 다시만다게되었을때 민수는 몇바퀴 돌았을때입니까?  		
	 */
	public static void main(String[] args) {
		
		int a = 90;
		int b = 60;
		int c = 45;
	
		
		int i = 1;
		while (true) {
			if(i%a == 0 && i%b == 0 && i%c == 0) {				
				System.out.println(i);
				break;				
			}
			System.out.println(i);
			i+=1;
		}
	}
	
}