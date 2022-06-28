package D6_반복문6_알고리즘;

import java.util.Scanner;

public class 반복문6_알고리즘_ATM종합4 {
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
		int count = 0;
		
		int log = -1; // -1(로그아웃), 1111(dbAcc1로그인), 2222(dbAcc2로그인)
		
		System.out.println("[1.로그인 0.종료 ]");
		int sel = scan.nextInt();
		
		boolean run = true;
		while(run) {
			
			if(log == -1) {
				if(sel == 1) {
						System.out.println("아이디를 입력하시오.");
						int id = scan.nextInt();
						System.out.println("비밀번호를 입력하시오.");
						int pw = scan.nextInt();
						
						if(id == dbAcc1 && pw == dbPw1) {
							System.out.println(dbAcc1+"님 로그인 성공");
							log = id;
						}
						else if(id == dbAcc2 && pw == dbPw2) {
							System.out.println(dbAcc2+"님 로그인 성공");
							log = id;
						}
						else {
							System.out.println("로그인 실패");
							count +=1;
							if(count == 3) {
								System.out.println("3회 연속 로그인 실패");
								run = false;
							}
						}
						if(log !=- 1) {
							System.out.println("[1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]");
							int sel2 = scan.nextInt();
							if(sel2 == 1) {
								System.out.println("입금할 금액입력");
								int money = scan.nextInt();
								
								if(id == dbAcc1) {
									dbMoney1+=money;
									System.out.println(id+"님 잔액" + dbMoney1+"원");
								}
								else if(id == dbAcc2) {
									dbMoney2+=money;
									System.out.println(id+"님 잔액" + dbMoney2+"원");
								}							
							}
							else if(sel2 == 2) {
								System.out.println("출금할 금액입력");
								int money = scan.nextInt();
								if(id == dbAcc1) {
									dbMoney1-=money;
									System.out.println(id+"님 잔액" + dbMoney1+"원");
								}
								else if(id == dbAcc2) {
									dbMoney2-=money;
									System.out.println(id+"님 잔액" + dbMoney2+"원");
								}
							}
							else if(sel2 == 3) {
								System.out.println("이체할 계좌 선택");
								int ss = scan.nextInt();
								System.out.println("이체할 금액선택");
								int money = scan.nextInt();
								if(id == dbAcc1 && ss == dbAcc2) {
									dbMoney1-=money;
									dbMoney2+=money;
								}
								else if(id == dbAcc2 && ss == dbAcc1){
									dbMoney1+=money;
									dbMoney2-=money;								
								}
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
}

