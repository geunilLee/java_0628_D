package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최소공배수1_문제4 {


	/*
		[문제]
		  8 과 12 의 최소 공배수를 구하시요
			 최소 공배수란 각 수의 배수를 나열한다음 처음으로 같은숫자를 말한다.
			 예) 8 16 24... 
			 예) 12 24....
			 여기서 24가 최소공배수이다.
	*/
	public static void main(String[] args) {
		
		int i = 1;
		while(true) {
			if(i%12 == 0 && i%8 == 0) {
				System.out.println(i);
				break;
			}
			
			
			
			i++;
		}

	}

}
