package D1_반복문1_알고리즘;

public class 반복문1_평가문제_약수2_문제 {
	/*
	 * [문제]
	 *  18의 약수의 갯수 더하기  21의 약수의 갯수를 출력하시오.
	 */
	public static void main(String[] args) {
		int i = 1;
		int run = 1;
		int c1 = 0;
		int c2 = 0;
		int num1 = 18;
		int num2 = 21;
		while(run == 1) {
			if(num1%i == 0) {
				c1+=1;
				//System.out.println("c1 : " + c1);
			}
			if(num2%i == 0) {
				c2+=1;
				//System.out.println("c2 : " + c2);
			}
			if(i > 21) {
				run = 0;
			}
			i+=1;
		}
		System.out.println("18 약수 : " + c1 +" "+ "21 약수 : "+c2);
	}
}