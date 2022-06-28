package D1_반복문1_프로젝트;

public class 반복문1_프로젝트_가운데값_문제 {

	/*
	 * [문제] 
	 * 		1~1000 사이의 숫자중 다음조건에 전부 해당하는 값을 출력하시오.
	 * 		[조건1] 28 배수를 전부 출력한다.
	    	[조건2] 가장 가운데위치의 값만 출력한다. 
	    	
	    	[예] 2의 배수라고 가정했을때,  { 2, 4, 6, 8, 10 } 출력값이 이럴때 6을 출력한다.
	    	[예] 2의 배수라고 가정했을때,  { 2, 4, 6, 8, 10, 12 } 이런식으로 짝수라도 6을출력한다.
	 */
	 
	public static void main(String[] args) {
		int max = 1000;
		int count = 0;
		int i = 1;
		while(i <= max) {
			if(i%28 == 0) {
				System.out.println("28의 배수 : " + i);
				count +=1;
			}
			i+=1;
		}
		
		
			if(count%2 == 0) {
				System.out.println("가운대 값" + (count/2)*28);
				
			}
			else if(count%2 != 0) {
				System.out.println("가운대 값 : " + ((count+1)/2)*28);
				
			}		
			
			
			
		
	}
	}