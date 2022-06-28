package D6_반복문6_알고리즘;

import java.util.Scanner;

public class 반복문6_알고리즘_ATM종합2 {
	/*
	 * [ATM]
	 *  [뒤로가기] 를 활용해 단계별로 기능을 구현한다. 
	 * 	[회원가입] 은 추후 배열에서 가능하다.
	 * 
	 * 메인화면기능         ==> [1.로그인 0.종료 ]
	 * 1번 로그인 선택시     ==> [1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]  
	 * 2번 종료 선택시       ==> [종료] 
	 * -------------------------------------------------
	 * [추가조건] 
	 * [1] 5.정보수정 선택시 ==> 비밀번호를 바꿀수있다.
	 * [2] 0.로그아웃 선택시 ==> 뒤로 돌아가서 [1.로그인 0.종료] 화면이 다시나온다.         
	 * [3] 로그인 3번실패시 강제 종료한다. 
	 *
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1; // -1(로그아웃), 1111(dbAcc1로그인), 2222(dbAcc2로그인)
		int count = 0;
		
		boolean run = false;
		while(run == true) {
			System.out.println("[1.로그인 0.종료 ]");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(log == -1) {
					
				
				System.out.println("아디를 입력하시오");
				int id = scan.nextInt();
				System.out.println("비밀번호를 입력하시오.");
				int pw = scan.nextInt();			
				
				if(id == dbAcc1 && pw == dbPw1) {
					log = id;
					System.out.println(dbAcc1 + "님 로그인성공");
				}
				else if(id == dbAcc2 && pw == dbPw2) {
					System.out.println(dbAcc2 + "님 로그인성공");
					log = id;
				}
				else {
					System.out.println("로그인실패");
					count +=1;
					if(count == 3) {
						System.out.println("3회 연속실패");
					}
				}
				}			
			
			
			run = true;
			while(true) {
				System.out.println("[1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]");
				int sel3 = scan.nextInt();
				if(sel3 == 1) {
					System.out.println("입금할 금액입력");
					int sel4 = scan.nextInt();
					
				}
				else if(sel3 == 2) {
					
				}
				else if(sel3 == 3) {   
					System.out.println("입금할 금액입력");
					int sel5 = scan.nextInt();
					
					
				}
				else if(sel3 == 4) {
	
				}
				else if(sel3 == 5) {
	
				}
				else if(sel3 == 0) {
					run = true;
				}
				
			}	
		}
	}
		
	


	}

}