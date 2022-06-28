package D6_반복문6_알고리즘;

import java.util.Scanner;

public class 반복문6_알고리즘_베스킨라빈스31 {
	/*
	 * [베스킨라빈스31]
	 *   베스킨라빈스 게임이란, 플레이어 2명이 번갈아가면서
	 *   1~3사이의 숫자를 선택할수있고, 그숫자들을 계속 더해서 
	 *   그누적합이 31에 먼저도달한쪽이 지는게임이다.
	 * 
	 * 
	 * 1) 각 플레이어는 번갈아가면서 1~3을 선택한다. // scan 1~3 선택
	 * 2) 만약에 이상한숫자를 입력하면 1~3을 입력할때까지 계속자기 차례이다. // 반복 뒤로가기
	 * 3) 각 플레이어가 선택한숫자는  total  변수에 계속 누적해서 더한다. // 변수 저장
	 * 4) total 이 31이상에 도달하면 승리자를 출력한다. total>31
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int total2 = 0;
		int max = 31;
		
		
		
		boolean run = true;// 첫번째 반복문 
		while(run) {
			System.out.println("숫자1 선택");// 숫자 선택
			int sel = scan.nextInt();
			System.out.println("숫자2 선택");//숫자 선택
			int sel2 = scan.nextInt();
			
			total+=sel; total2+=sel2;
			
			if(total >= max){
				System.out.println("플레이어1 승리 : " + total);
				
			}
			else if(total2 >= max) {
				System.out.println("플레이어2 승리 : " + total2);
				
			}
			
				boolean run2 = true; // 두번째 반복문 sel < 3 && sel > 1 이럴때 반복
				while(run2) {
					if(sel > 3 || sel < 1) {
						System.out.println("sel : " + sel);
						System.out.println("다시 선택");
						run2 = false;
					}
					else if(sel2 > 3 || sel2 < 1){
						System.out.println("sel : " + sel2);
						System.out.println("다시 선택");
						run2 = false;						
					}
					
				}
				System.out.println("sel : " + sel);
				System.out.println("sel2 : " + sel2);
			
		}
		System.out.println("플레이어 1 : " + total);
		System.out.println("플레이어 2 : " + total2);	
		
	}

}