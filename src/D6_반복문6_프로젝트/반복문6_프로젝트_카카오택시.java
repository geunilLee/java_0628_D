package D6_반복문6_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 반복문6_프로젝트_카카오택시 {
	/*
	 * 
	 * [카카오 택시]
	 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
	 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
	 * 3. 메뉴는 아래와 같다.
	 * 		1) 속도설정 : 1~3까지만 가능
	 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
	 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
	 * 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
	 * 5. 도착하면 다시 -10 ~ 10 사이의 랜덤 목적지가 설정된다.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		int 요금 = 0;
		
		
		
		boolean run = false;
		while(run) {
			int x = ran.nextInt(21)-10;
			int y = ran.nextInt(21)-10;
			System.out.println("x : " + x);
			System.out.println("y : " + y);
			
			boolean run2 = true;
			while(run2) {
				System.out.println("1~3속도 설정");
				int sel = scan.nextInt();
				요금 += 1;	
				if(sel == 1) {
					
				}
				else if(sel == 2) {
						
				}
							
							
							
							
					}
					
						
						
					
					
		}
		
	
	}

}