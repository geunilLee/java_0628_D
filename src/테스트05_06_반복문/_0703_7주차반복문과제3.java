package 테스트05_06_반복문;

import java.util.Random;

public class _0703_7주차반복문과제3 {
	public static void main(String[] args) {
		  /*
	        랜덤숫자 (1~9) 사이의 숫자  8개를 출력한다. 
	        단 아래의 조건을 참고한다. 
	        
	        예를 들어 숫자가 4 5 6 1 2 3 4 5 이라고 한다면
	        아래와 같이 출력한다. 
	        
	        [출력]
	           4 5 6
	           5 6 1
	           6 1 2
	           1 2 3
	           2 3 4
	           3 4 5 
        
      */
		Random ran = new Random();
		
		int number = 0;
		int count = 2;
		int a = 0;
		
	
		int i = 1;
		
		while(i <= 8) {
			int r = ran.nextInt(9)+1;
			count +=1;
			
			//System.out.println("번호 : " + i +"  "+ "램덤 숫자 :" + r);			
			
			if(i <= count) {
				
				a+=1;
				if(a <= 3)
					System.out.print (r);
			}
			i+=1;
			
		}	
		
	}
}