package D1_반복문1_기본이론;

public class 반복문1_기본이론3_기본문제3 {
	/*
	 
	 [문제1] 1~10까지 중에서 3미만 7이상의 합을 출력하시오.
	       1 + 2 + 7 + 8 + 9 + 10
	 [정답1] 37


	 [문제2] 1~10까지 중에서 3미만 7이상의 개수를 출력하시오. 
			 1,2,7,8,9,10 ==> 6개 
	 [정답2] 6
	 
	*/
	public static void main(String[] args) {
		int i = 1;
		int a = 0;
		while(i <= 10) {
			if(i<3 || 7<=i) {
				//System.out.println(i);
				a = a+i;
				
			}			
			i+=1;			
		}
		System.out.println(a);
		System.out.println();
		
		i = 1;
		int count = 0;
		while(i <= 10) {
			if(i<3 || i>=7) {
				//System.out.println(i);
				count +=1;
			}
			i+=1;
		}
		System.out.println(count);
	}
}