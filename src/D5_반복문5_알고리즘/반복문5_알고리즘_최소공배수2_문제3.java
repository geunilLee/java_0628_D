package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최소공배수2_문제3 {
	/*
	 * [문제]
	   	철수와 민수는 같은 수영장에 다닌다
	   	철수는 4일마다 한번씩 가고 민수는 5일만다한번씩 간다.
	   	
	   	철수와 민수가 2월 3일날 처음만났다면 다음에 서로 만나는 날은 언제인가?
	   	
	 */
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int c = 3;
		
		int num1 = a+c;
		int num2 = b+c;
		
		for(int i = 1; i == 1;) {
			if(num1 < num2) {
				num1+=a;
			}
			else if(num1 > num2) {
				num2+=b;
			}
			if(num1 == num2) {
				System.out.println(num1);
				break;
			}
			
			
			
		}
	}
}