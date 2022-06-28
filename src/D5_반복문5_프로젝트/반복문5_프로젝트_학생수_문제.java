package D5_반복문5_프로젝트;

public class 반복문5_프로젝트_학생수_문제 {
	
	/*  
	  [문제]
		   a중학교 1학년 입학하는 학생들은 8줄 12줄 18줄로 세워도 항상 5명이 남을때,
		   1학년 전체 학생수를 구하여라.
		   (학생수는 200명이상 250명미만)
	 
	 */
	public static void main(String[] args) {
		int l = 8;
		int l1 = 12;
		int l2 = 18;
		int a = 200;
		
		
		
		while(true) {
			if(a%l == 5 && a%l1 == 5 && a%l2 == 5) {
				System.out.println(a);
				break;
			}
			a+=1;
		}
		
	}
	
}