package D6_반복문6_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 반복문6_프로젝트_카카오택시4 {
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
		Random  ran = new Random();
		
		int dx = 0;
		int dy = 0;
		
		int x = 0;
		int y = 0;
		
		int speed = 0;
		int dir = 0;
		
		int 요금 = 50;
		
		x = ran.nextInt(21)-10;
		y = ran.nextInt(21)-10;
		
		while(true) {
			요금 += speed;
			System.out.println("가야되는 거리 : " + "x : " + x + "  " + " y : " + y);
			System.out.println("현재거리 : " + "dx : " + dx + "  " + " dy : " + dy);
			System.out.println("속도 설정하시오");
			speed = scan.nextInt();
			System.out.println("방향 설정 : 동(1)서(2)남(3)북(4)");
			dir = scan.nextInt();
			
			if(speed > 1 && 3 < speed ) {
				System.out.println();
				speed = 1;
			}
			if(dir > 1 && 4 > dir) {
				System.out.println();
				speed = 1;				
			}
			if(dir == 1) {
				dx += speed;
			}
			else if(dir == 2){
				dx-= speed;
			}
			else if(dir == 3){
				dy-= speed;
			}
			else if(dir == 4){
				dy+= speed;
			}
			if(dx == x && dy == y) {
				System.out.println("도착하였습니다.");
				System.out.println("요금 : " + (speed * 요금));
				break;
			}
			
		}
	
	}

}