package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_공배수1_문제 {
	/*
	  
	  	[문제]
	   		12와 15의 공배수를 작은것부터 순서대로 5개만 출력 
	 */
	public static void main(String[] args) {
		
		int a = 12;
		int b = 15;
		
		int count = 0;
		int num1 = a;
		int num2 = b;
		for(int i = 1; i == 1;) {
			
			if(num1 < num2) {
				num1+=a;
				System.out.println("aaaa    "+num1);
			}
			else if(num1 > num2) {
				num2+=b;
				System.out.println("bbbb    "+num2);
			}
			
			
			else if(num1 == num2) {
				count +=1;
				System.out.println(num1);
				num1 += a;
				
			
			}
			if(count == 5) {
				break;
			}
			
		}
		
		
		
	}
}