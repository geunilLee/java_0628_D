package D1_반복문1_기본이론;

public class 반복문1_기본이론3_기본문제2 {
	/*
	 [문제1] 1~5까지의 합을 출력하시오.  1 + 2 + 3 + 4 + 5
	 [정답1] 15

	
	
	*/
	public static void main(String[] args) {
		int i = 1;
		int a = 0;
		while(i <= 5) {
			a = a+i;
			
			i+=1;
		}
		System.out.println(a);
	}
}