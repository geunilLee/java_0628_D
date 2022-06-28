package D6_반복문6_프로젝트;

import java.util.Scanner;

public class 반복문6_프로젝트_rpg던전탐험 {
	/*
       [반복문 최종프로젝트] 시간제한없이 자유롭게 하면된다.
	 * [던전탐험게임]
	 * 플레이어는 무기 방어구 체력 돈 운 등의 데이터가 있다. (새로운 변수 추가 가능)
	 * 플레이어와 적은 1명으로 하고 2명이상은 추후 배열에서 가능하다.
	 * 
	 * 1) 메인메뉴 ==> [1.여관] [2.대장간] [3.던전] [0.종료]
	 * 
	 * 2) [1.여관] 은 소지금을 소모해 체력과 스킬회복 또는 아이템구입을 한다.
	 * 				 ==> [1.숙박(체력,스킬회복)][2.물약구입][0.뒤로가기]
	 * 3) [2.대장간] 은 소지금을 소모해 랜덤으로 무기와 방어구 업그레이드 시켜준다. 
	 * 			    ==> [1.무기업][2.방어구업][0.뒤로가기]
	 * 4) [3.던전] 은 몬스터를 만나 전투를한다. ==> [1.공격][2.스킬][3.물약먹기][0.뒤로가기]
	 * 			스킬은 2번 공격을 한다.
	 * 			물약을 먹으면 체력이 회복한다. 
	 * 			승리하면 돈을 획득한다. 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int 현재체력 = 0;
		int 최대체력 = 0;
		
		int 공격력 = 0;
		int 방어력 = 0;
		
		int 물약개수 = 0;
		int 스킬개수 = 0;
		int 소지금 = 0;
		
		int 몬스터현재체력 = 0;
		int 몬스터최대체력 = 0;
		int 몬스터공격력 = 0;
		int 몬스터소지금 = 0;
		
		boolean run = true;
		while(run) {
			System.out.println("[1.여관] [2.대장간] [3.던전] [0.종료]");
			int sel = scan.nextInt();
			if(sel == 1) {
				boolean run2 = true;
				while(run2) {
					System.out.println("[1.숙박(체력,스킬회복)][2.물약구입][0.뒤로가기]");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("체력,스킬회복");
					}
					else if(sel2 == 2) {
						System.out.println("물약구매완료");
					}
					else if(sel2 == 0) {
						System.out.println("뒤돌아가기");
						run2 = false;
					}					
				}				
			}
			else if(sel == 2) {
				boolean run3 = true;
				while(run3) {
					System.out.println("[1.무기업][2.방어구업][0.뒤로가기]");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("무기업");
					}
					else if(sel2 == 2) {
						System.out.println("방어구업");
					}
					else if(sel2 == 0) {
						System.out.println("뒤로가기");
						run3 = false;
					}					
				}	
				
			}
			else if(sel == 3) {
				boolean run4 = true;
				while(run4) {
					System.out.println("[1.공격][2.스킬][3.물약먹기][0.뒤로가기]");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("공격");
					}
					else if(sel2 == 2) {
						System.out.println("스킬");
					}
					else if(sel2 == 3) {
						System.out.println("물약먹기");
						
					}
					else if(sel2 == 0) {
						System.out.println("뒤로가기");						
						run4 = false;						
					}
				}
				
			}
			else if(sel == 0) {
				System.out.println("종료");
				run = false;
			}
			
			
		}
		
	}
	
}