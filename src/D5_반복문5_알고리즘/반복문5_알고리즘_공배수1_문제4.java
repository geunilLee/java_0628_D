package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_공배수1_문제4 {
	/*
	  
	  	[문제]
	   		12와 15의 공배수를 작은것부터 순서대로 5개만 출력 
	 */
	public static void main(String[] args) {
		
		int i = 1;
		int count = 0;
		
		int unm = 12;
		int num2 = 15;
		while(true) {
			if(i%unm == 0 && i%num2 == 0) {
				count +=1;
				System.out.println(i);
				
				if(count == 5) {
					break;
				}
			}
			
			
			i+=1;
		}
	}
}
