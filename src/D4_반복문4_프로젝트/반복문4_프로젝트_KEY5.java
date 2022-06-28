package D4_반복문4_프로젝트;

import java.util.Scanner;

public class 반복문4_프로젝트_KEY5 {
	/*
	 * [키위치 찾기]
	 * 예) 
	 * result 값 입력 : 99
	 * 
	 * 입력 : 10
	 * 입력 : 99
	 * 입력 : 20
	 * 입력 : 99
	 * 입력 : 30
	 * 입력 : 99
	 * 입력 : 10
	 * 입력 : -1
	 * 
	 * 결과 : key값 99가 첫번재 나타난 것은 2번째 이다.
	 * 
	 *  1. -1이 나올 때까지 일련의 수를 입력받는다.
	 *               scan == -1 break;
	 * 2. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
	 *               key 값 나올때마다 카운트 하고 키가 맞을때 (카운터와 같이 출력) key 순서 number
	 * 3. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
	 *                a<r  a=r  (= 빼고)
	 * 4. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
	 *                sel i= key
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int result = 99;        

		System.out.print("key값 입력 : ");
		int key = scan.nextInt();
        
        // 경우의 수 ==> -1 ==> "not found"
        // 경우의 수 ==> 99, 77, -1 ==> 키는 1번이다. 
        // 경우의 수 ==> 55, 99, 99, 99, 99, 3, -1 ==> 키는 2번이다.
		//int count = 0;
		int number = 1;
		while(true) {
			
			
			int sel = scan.nextInt();
			
			if(sel == -1) {
				System.out.println(number+" 번째");
				break;				
			}
			else if(sel == 99) {
				
			}
			number +=1;
		}
		

	}

}