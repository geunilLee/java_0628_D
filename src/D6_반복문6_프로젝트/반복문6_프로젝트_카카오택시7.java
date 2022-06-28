package D6_반복문6_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 반복문6_프로젝트_카카오택시7 {
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
		
		int x = 0;
		int y = 0;
		
		int dx = 0;
		int dy = 0;
		
		int speed = 0;
		int dir = 0;
		
		int  요금 = 0;
		
		x = ran.nextInt(21)-10;
		y = ran.nextInt(21)-10;
		
		while(true) {
			System.out.println("가야되는 위치 " + x +" , "+ y);
			System.out.println("현재위치 : " + dx +" , "+ dy);
			System.out.println("속도 : " + speed + "  " + "방향 : " + dir);
			System.out.println("[1.속도] [2.방향] [3.이동하기] [0.종료]");
			int sel = scan.nextInt();
			if(sel == 0) {
				System.out.println("종료");
				break;
			}
			else if(sel == 1) {
				System.out.println("가야되는 위치 " + x +" , "+ y);
				System.out.println("속도를 설정하시오.");
				speed = scan.nextInt();
				if(speed < 1 && speed > 3) {
					speed = 1;
				}				
			}
			else if(sel == 2) {
				System.out.println("가야되는 위치 " + x +" , "+ y);
				System.out.println("방향를 설정하시오. [1.동] [2.서] [3.남] [4.북]");
				dir = scan.nextInt();
				if(dir < 1 && dir > 3) {
					dir = 1;
				}				
			}
			else if(sel == 3) {
				if(dir == 1) {
					dx += speed;
				}
				else if(dir == 2) {
					dx -= speed;
				}
				else if(dir == 3) {
					dy -= speed;
				}
				else if(dir == 4) {
					dy += speed;
				}
				요금 += speed;
				speed = 0;
				dir = 0;
			}
			if(dx == x && dy == y) {
				System.out.println("현재위치 : " + dx +" , "+ dy);
				System.out.println("도착");
				System.out.println("칸수 : " + 요금);
				System.out.println("요금 : " + (요금*50));
				speed = 0;
				dir = 0;
				요금 = 0;
				x = ran.nextInt(21)-10;
				y = ran.nextInt(21)-10;
				
			}
		}
		
		
	
	}

}