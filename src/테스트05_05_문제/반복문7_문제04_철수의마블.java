package 테스트05_05_문제;

import java.util.Random;

/* 
	[철수의마블]
		철수는 마블게임을 하고있다. 	
		0~20까지의 지점이 있고 철수는 0의 위치에 있다. 
		20이 넘어가면 게임종료이다. 
		주사위는 1~6사이의 숫자가 나온다.	
		3의 배수의 자리는 함정이다.(3,6,9,12,15,18) 
		함정에서는 한번더 주사위를 던지고 4이상의 숫자가 나오면 함정탈출이되며 한칸 앞으로 전진한다.
		함정에 실패하면 뒤로 한칸 물러나게된다. 	
		철수가 게임을 끝날때까지 철수의 이동경로를 전부 출력하시오. 	
*/
public class 반복문7_문제04_철수의마블 {
	public static void main(String[] args) {
		Random ran = new Random();
		int 철수위치 = 0;
		int 주사위 = 0;
		int 주사위2 = 0;
		
		int 철수 = 0;
		while(true) {
			주사위 = ran.nextInt(6)+1;
			System.out.println("주사위 : " + 주사위);
			철수위치 += 주사위;
			System.out.println("철수위치 : " + 철수위치);
			
			if(철수위치 >= 20){
				System.out.println("게임종료");
				break;
			}
				if(철수위치 % 3 == 0) {
				주사위 = ran.nextInt(6)+1;
				System.out.println("함정 주사위 : " + 주사위);
				if(주사위 >= 4) {
					철수위치 +=1;
					System.out.println("탈출성공");
					System.out.println("함정빠진 철수위치 +1: " + 철수위치);	
					
				}
				else {
					System.out.println("탈출실패");
					철수위치 -=1;
					System.out.println("함정 주사위 : " + 주사위);
					System.out.println("철수위치 -1: " + 철수위치);
					
					
				}
				
			}
			
			
		}
	}
}