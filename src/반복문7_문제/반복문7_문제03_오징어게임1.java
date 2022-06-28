package 반복문7_문제;

import java.util.Random;
/*
	[오징어게임]
		철수는 오징어게임에 참가하였다.
		첫번째 게임은 "무궁화꽃이 피었습니다" 이다.
		규칙은 아래와같다.	
	[규칙]	
		[1] 전체 거리는 0 ~ 25까지 거리가 있다.
		[2] 철수는 현재 0의 자리에 있다.
		[3] 철수는 매턴 1 ~ 4의 랜덤숫자를뽑는다. 숫자만큼 이동한다. 
		[4]	이동거리를 누적하며, 합이 25이상이되면 승리이며 종료한다.
		[5] 인형은 매턴 3 ~ 5의 랜덤숫자를뽑는다. 
		[6] 인형보다 큰 숫자가나오면 움직인것으로 간주되어 패배하며 종료한다.
		[7] 10턴안에 도착못하면 시간초과로 패배하며 종료한다.
		[8] 철수의 이동경로 와 인형의 숫자를 전부 출력하시오.
 */
public class 반복문7_문제03_오징어게임1 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int i = 1;
		int a = 0;
		int b = 0;
		int max = 25;
		while (true) {
			int 철수 = ran.nextInt(4)+1;
			int 인형 = ran.nextInt(3)+3;
			a += 철수;
			b += 인형;
			System.out.print (i+"번"+"  " +"철수 이동거리 : "+철수 + "    ");
			System.out.println("철수 현재위치 : " + a + "    ");
			System.out.print (i+"번"+"  "+"인형 이동거리 : "+인형);
			System.out.println("    "+"인형 현재위치 : " + b);
			
			if(철수 > 인형) {
				System.out.println("철수 : "+철수);
				System.out.println("인형 : "+인형);
				System.out.println("철수가 움직여서 패배!!");
				break;
			}			
			else if(a>=25) {
				System.out.println("철수 승리!!    철수 위치는?"+ a);
				break;
			}
			else if(b>=25){
				System.out.println("인형 승리!!    인형위치는?" + b);
				break;
			}
			
			if(i == 10) {
				System.out.println(i);
				System.out.println("시간초과 패배");
				break;
				}
			i+=1;
	}
		//System.out.println(a);
		//System.out.println(b);
}
}