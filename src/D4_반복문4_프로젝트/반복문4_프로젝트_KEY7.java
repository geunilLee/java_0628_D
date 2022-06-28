package D4_반복문4_프로젝트;

import java.util.Scanner;

public class 반복문4_프로젝트_KEY7 {
	/*
	 * [키위치 찾기]
	 * 
	 * 1. -1이 나올 때까지 일련의 수를 입력받는다. while true
	 * 2. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오. 위 수중 체크해서 번째 i로 변수
	 * 3. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오. 체크해서 맞으면 저장 맞으면 바꿈
	 * 4. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오. 체크해서 키가 없으면 찾지못함
	 * 
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
		boolean check = false;
		int i = 1;
		int a = 0;
		while(true) {
			System.out.print("key값 입력 : ");
			int key = scan.nextInt();
			
			if(key == -1 && check == false) {
				System.out.println("not found");
				break;
			}
			else if(key == -1) {
				System.out.println(a);
				break;
			}
			if(key == result && check == false){
				check = true; a=i;
			}
			i+=1;
		}
		
		
		

	}

}