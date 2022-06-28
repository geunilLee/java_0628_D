package D4_반복문4_알고리즘;

public class 반복문4_알고리즘_369박수_문제6 {
	/*
	 * 
	 *  [369게임]
	 * 1. 1~999까지 반복을 한다.
	 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
	 * 
	 * 3. 각각의 숫자에 3이나 6이나 9가 두개 면 "짝짝"
	 * 4. 각각의 숫자에 3이나 6이나 9가 한개 면 "짝"
	 * 5. 3이나 6이나 9가 없으면 그냥 숫자출력 
	 * 
	 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
	 */
	public static void main(String[] args) {
		int i = 1;
		while(i <= 999) {
			int a = i/100;
			int b = i%100/10;
			int c = i%10;
			
			int count = 0;
			
			if(a == 3 || a == 6 || a == 9) {
				count +=1;
			}
			if(a == 6 || b == 6 || c == 6) {
				count +=1;
			}
			if(a == 9 || b == 9 || c == 9) {
				count +=1;
			}
			
			if(count == 3) {
				System.out.println("짝짝짝");
				
			}
			else if(count == 2) {
				System.out.println("짝짝");
				
			}
			else if(count == 1) {
				System.out.println("짝");
				
			}
			else {
				System.out.println(i);
			}
			
			
			i+=1;
		}
		
		
	}

}