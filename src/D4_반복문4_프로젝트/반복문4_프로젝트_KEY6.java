package D4_반복문4_프로젝트;

import java.util.Scanner;

public class 반복문4_프로젝트_KEY6 {
	/*
	 * [키위치 찾기]
	 * 
	 * 1. -1이 나올 때까지 일련의 수를 입력받는다.
	 * 2. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
	 * 3. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
	 * 4. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
	 * 
	 * 1. 멈추는건  -1
	 * 2. 입력받을때 카운트 세고 -1일때 카운트 출력
	 * 3. 키가 여러개 일때 카운트 비교 하고 작은수로 출력
	 * 4. -1일때 키가 없으면 낫파운드 
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
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int result = 99;
        

		
        
        // 경우의 수 ==> -1 ==> "not found"
        // 경우의 수 ==> 99, 77, -1 ==> 키는 1번이다. 
        // 경우의 수 ==> 55, 99, 99, 99, 99, 3, -1 ==> 키는 2번이다.
		int i = 1;
		int a = 0;
		boolean check = false;  
		while(true) {
			System.out.print("key값 입력 : ");
			int key = scan.nextInt();
			
			if(key == result && check == false) {
				check = true; a = i;
				/*
				  키가 맞을때 체크가 거짓이면 i를 a로 저장하여 순번을 저장
				  트루이면 첫번째가 아니므로 다음 조건문으로 넘어가게된다 
				 */
			}
			if(key == -1 && check == false) {
				System.out.println("not found");
				break;
				/*
				 키가 -1일때 체크가 거짓이면 키가 안나온것임으로 찾지못했다 출력
				 */
			}
			else if(key == -1) {
				System.out.println("번호 : " + a);
				break;
				/*
				 키가 -1 이면 저장된 키의 숫서를 출력하고 멈춘다
				 답이 두가지 체크 해야되면 블린을 사용하는것이 효율적 
				 */
			}
				
			i+=1;
		}
		
	}
}