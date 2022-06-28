package D1_반복문1_프로젝트;

public class 반복문1_프로젝트_가까운값_문제 {
	/*
	 * [문제] 
	 * 		1 에서 200 사이의 숫자중 다음 조건에 전부 맞는 숫자를 출력.
	 *     	[조건1] 6의 배수를출력
	 *      [조건2] 100에 가장가까운 수를 출력 
	 		
	 		정답 : 102
	 */
	  
	public static void main(String[] args) {
		int start = 1;
		int max = 200;
		int a = 100;
		int num = 0;
		int num2 = 0;
		
		int i = 1;
		int run = 1;
		while(run == 1) {
			if(i <= max && i%6 == 0) {
				//System.out.println(i);
				if(i <= a) {
					if (num <= i) {
						num = i;
						//System.out.println("작은수 : " + num);											
					}
					num2 = num + 6;
					if(num2 - a < a-num) {
						System.out.println("num2");
						run = 0;
					}
					else if(num2 - a > a-num) {
						System.out.println("num");
						run = 0;
					}
				}				
				
				
				
			}
			if(i>max) {
				run = 0;
			}
			
			
			i+=1;
			
		}
	}
}