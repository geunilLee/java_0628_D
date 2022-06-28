package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_공배수1_문제3 {
	/*
	  
	  	[문제]
	   		12와 15의 공배수를 작은것부터 순서대로 5개만 출력 
	 */
	public static void main(String[] args) {
		
		
		//int count = 0;
		int i = 1;
		while(true) {
			if(i%12 == 0 && i%15 == 0) {
				System.out.println(i);
				break;
				
				//if(count == 5) {
										
					//break;
				//}
			}
			
			
			
			i+=1;
		}
	}
}