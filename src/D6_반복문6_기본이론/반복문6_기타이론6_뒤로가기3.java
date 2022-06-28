package D6_반복문6_기본이론;

import java.util.Scanner;

public class 반복문6_기타이론6_뒤로가기3 {
	/*
	 * [뒤로가기]
	 *      쇼핑몰메인메뉴에서 남성의류를 선택후
	 *      뒤로가기 누르기전까지 남성의류 페이지를 유지할려고한다.
	 * 		
	 * 1. 남성의류
	 * 		1) 티셔츠
	 * 		2) 바지
	 * 		3) 뒤로가기
	 * 2. 여성의류
	 * 		1) 가디건
	 * 		2) 치마
	 * 		3) 뒤로가기
	 * 3. 종료
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// 사용자의 이동 조건위해 입력
		
		boolean run = true;// 뒤로가기를 위해 생성
		while(true) {//첫번째 반복문 사용
			System.out.println("1. 남성의류");// +++++
			System.out.println("2. 여성의류");//++++++
			System.out.println("3. 종료");// 이상 3가지 종류
			
			System.out.println("메뉴 선택");
			int sel = scan.nextInt();// 입력값을 1~3 까지 입력을 받아라
			if(sel == 1) {
				boolean run2 = true;// 뒤로가기하면 돌아올지점
				while(run2) {// 1번선택시 안에서 돌아야할 2번째 반복문
					System.out.println("1) 티셔츠");//+++++
					System.out.println("2) 바지");//+++++
					System.out.println("3) 뒤로가기");//+++++
					System.out.println("메뉴 선택");//이상 안내문			
					int sel2 = scan.nextInt();// 두번째 입력 값 입력 받는다
					if(sel2 == 1) {
						System.out.println("티셔츠");
					}
					else if(sel2 == 2) {
						System.out.println("바지");
					}
					else if(sel2 == 3) {
						System.out.println("뒤로가기");
						run2 = false; // 트루를 폴스로 바꿔주면 뒤로가기
					}
				}	
			}
			if(sel == 2) {
				boolean run3 = true;
				while(run3) {
					System.out.println("1) 티셔츠");
					System.out.println("2) 바지");
					System.out.println("3) 뒤로가기");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
					System.out.println("티셔츠");
					}
					else if(sel2 == 2) {
					System.out.println("바지");
					}
					else if(sel2 == 3) {
					System.out.println("뒤로가기");
					run3 = false;
					}
							
				}								
			}
			if(sel == 3) {
				System.out.println("종료");
				run = false;
				break;
			}
			
						
		}
	}

}