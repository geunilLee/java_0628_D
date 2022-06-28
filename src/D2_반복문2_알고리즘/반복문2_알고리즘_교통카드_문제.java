package D2_반복문2_알고리즘;
public class 반복문2_알고리즘_교통카드_문제 {
	/*
    문제)
    
package D2_반복문2_알고리즘;
public class 반복문2_알고리즘_교통카드_문제 {
	/*
    문제)
    
     선호네 반 학생 25명이 체험학습을 하러 가기위해
     버스를 탔는데 , 총요금이 19400원이였다.

     교통카드를 사용하면 720원이고 , 
     현금으로 지불하면 1000원일때, 

     교통카드를 사용한 학생수와 현금을 사용한 학생수는 
     각각 얼마인가?
 */
	public static void main(String[] args) {
		
		int 총학생수 = 25;
		int 총요금 = 19400;
		
		int 교통카드 = 720;
		int 현금 = 1000;
		
		int a = 총학생수;
		int b = 0;	
		int run = 1;
		while(run == 1) {
			if(교통카드*a + 현금*b == 총요금 && a + b == 총학생수) {
				System.out.println("교통카드 : " + a+ "  "+ " 현금 : " + b);
				
				run = 0;				
			}			
			a-=1;
			b+=1;
			
		}

	} 
}