package D5_반복문5_프로젝트;

public class 반복문5_프로젝트_학생수_문제2 {
	
	/*  
	  [문제]
		   a중학교 1학년 입학하는 학생들은 8줄 12줄 18줄로 세워도 항상 5명이 남을때,
		   1학년 전체 학생수를 구하여라.
		   (학생수는 200명이상 250명미만)
	 
	 */
	public static void main(String[] args) {
		
		int num = 8;
		int num2 = 12;
		int num3 = 18;
		int 나머지 = 5;
		int student = 200;
	
		
		while(true) {
			if(student%num == 나머지 || student%num2 == 나머지 || student%num3 == 나머지) {
				System.out.println(student);
				break;
			}
			
			student += 1;
			
		}
	}
	
}