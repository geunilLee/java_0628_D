package D3_반복문3_프로젝트;

import java.util.Scanner;

public class 반복문3_프로젝트_반복문로그인_문제4 {
	/*
	 * 1. 로그인 . 로그인 후 재 로그인 불가 . 로그아웃 상태에서만 이용 가능 
	 * 2. 로그아웃 . 로그인 후 이용가능
	 * 3. 로그인,로그아웃 관리는 log 는 변수를 이용한다.
	 *  [예] -1(로그아웃), 1111(id1), 2222(id2)
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int id1 = 1111;
		int pw1 = 1234;

		int id2 = 2222;
		int pw2 = 2345;

		int log = -1; // -1(로그아웃), 1111(id1), 2222(id2)

		boolean run = true;
		while (run == true) {

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if(log != -1) {
					System.out.println("이미" + log + "님으로 로그인중");
					System.out.println("로그아웃후 이용가능");					
					break;
				}
				
				System.out.println("아이디를 입력하시오.");
				int id = scan.nextInt();
				System.out.println("비밀번호를 입력하시오.");
				int pw = scan.nextInt();
				
				if(id == id1 && pw == pw1){
					System.out.println(id1 + "님 로그인 성공");
					log = id;
				}
				else if(id == id2 && pw == pw2){
					System.out.println(id2 + "님 로그인 성공");
					log = id;
				}
				else {
					System.out.println("로그인 실패");
				}				
			} else if (sel == 2) {
				if(log == -1) {
					System.out.println("이미 로그아웃인 상태입니다.");
					
				}
				else if(log != -1) {
					log = -1;
					System.out.println("로그아웃이되었습니다");
				}
				
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}