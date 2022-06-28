package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_공약수1_문제3 {
	/*
	 * [문제]
	   		105와 63과 175의 공약수를 구하시오
	 */
	public static void main(String[] args) {
		
		
		int count = 0;
		int i = 1;
		while(true) {
//			if(105%i == 0) {
//				System.out.println("105 약수 : " + i + " ");
//				
//			}
//			if(63%i == 0) {
//				System.out.println("63 약수 : " + i + "  ");
//				
//			}
//			if(175%i == 0) {
//				System.out.println("175 약수 : " + i + " ");
//				
//			}					
			if(105%i == 0 && 63%i == 0 && 175%i == 0) {
				System.out.println("공약수 : " + i);
				count +=1;
				if(count == 2) {
					break;
				}
			}
			
			
			i+=1;
			
		}
		
	}
}