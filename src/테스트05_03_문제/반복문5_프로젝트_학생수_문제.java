package 테스트05_03_문제;

public class 반복문5_프로젝트_학생수_문제 {
	
	/*  
	  [문제]
		   a중학교 1학년 입학하는 학생들은 8줄 12줄 18줄로 세워도 항상 5명이 남을때,
		   1학년 전체 학생수를 구하여라.
		   (학생수는 200명이상 250명미만)
	 
	 */
	public static void main(String[] args) {
		int i = 1;
		int a = 8;
		int b = 12;
		int c = 18;
		int d = 0;
		while(i<=250) {
			if(i%a == 5 && i%b == 5 && i%c == 5) {
				//System.out.println(i);
				if(d<i) {
					d = i;
					
				}
			}
			
			
			
			i+=1;
		}
		System.out.println(d);
	}
	
}