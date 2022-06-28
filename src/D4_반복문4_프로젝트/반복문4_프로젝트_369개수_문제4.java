package D4_반복문4_프로젝트;

public class 반복문4_프로젝트_369개수_문제4 {
	/*
	 * [369게임]
	  
		  1~ 10000 사이의 숫자를 입력받고 
		  3이나 6이나 9의  개수출력하시오.
	 
		  예) 9999 ==> 4
		  예) 36 ==> 2
		  예) 1 ==> 0
		  예) 222 ==> 0  
	 */
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1; i<= 1000; i ++) {
			int a = i/1000;
			int b = i%1000/100;
			int c = i%1000%100/10;
			int d = i%10;
			
			if(a == 3 || a == 6 || a == 9) {
				count +=1;
			}
			else {
				System.out.println(i);
			}
			System.out.println("369 갯수 :  " + count);
			
		
		
	}
}
}