package D6_반복문6_알고리즘;

import java.util.Scanner;

public class 반복문6_알고리즘_ATM종합7 {

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
		
		System.out.println("메뉴선택");
		System.out.println("[1.로그인] [2. 종료]");
		int sel = scan.nextInt();
		
		
		int log = -1;
		boolean run = true;
		while(run = true) {			
						
				if(sel == 1) {
					if (log == -1) {
						int count = 0;
						while(true) {
							System.out.println("아이디 입력");
							int id = scan.nextInt();
							System.out.println("비밀번호 입력");
							int pw = scan.nextInt();

							if (id == dbAcc1 && pw == dbPw1) {
								log = id;
								System.out.println(id + "님 로그인성공");
							}
							else if (id == dbAcc2 && pw == dbPw2) {
								log = id;
								System.out.println(id + "님 로그인성공");
							}
							else {
								count++;
								System.out.println("로그인 실패");							
								System.out.println(count + "번 실패 3번실패시 로그인불가.");
							}
							if (count == 3) {
									System.out.println("로그인 3회 실패");
									run = false;
									break;							
								}							
						}					
					}
					if(log != -1) {
						while(true) {
							System.out.println("[1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]");
							int sel2 = scan.nextInt();
							if(sel2 == 0) {
								System.out.println("로그아웃");
								log = -1;
								break;
							}
							else if(sel2 == 1) {
								System.out.println("입금할 금액 입력");
								int money = scan.nextInt();
								if(log == dbAcc1) {
									dbMoney1 += money;
									System.out.println("입금 완료");
								}
								else if(log == dbAcc2) {
									dbMoney2 += money;
									System.out.println("입금 완료");
								}							
							}
							else if(sel2 == 2){
								System.out.println("출금할 금액 입력");
								int money = scan.nextInt();
								if(log == dbAcc1) {
									dbMoney1 -= money;
									System.out.println("출금 완료");
								}
								else if(log == dbAcc2) {
									dbMoney2 -= money;
									System.out.println("출금 완료");
								}							
							}
							else if(sel2 == 3) {
								System.out.println("이체할 계좌번호 입력");
								int passid = scan.nextInt();
								System.out.println("이체할 금액 입력");
								int passmoney = scan.nextInt();
								if(log == dbAcc1) {
									if(passid == dbAcc2) {
										dbMoney1 -= passmoney;
										dbMoney2 += passmoney;
									}								
								}
								if(log == dbAcc2) {
									if(passid == dbAcc1) {
										dbMoney2 -= passmoney;
										dbMoney1 += passmoney;
									}								
								}
							}
							else if(sel2 == 4) {							
								if(log == dbAcc1) {
									System.out.println("현재 잔액 : " + dbMoney1);
								}
								else if(log == dbAcc2) {
									System.out.println("현재 잔액 : " + dbMoney2);
								}							
							}
							else if(sel2 == 5){
								System.out.println("변경할 비밀번호 입력");
								int repw = scan.nextInt();
								if(log == dbAcc1) {
									dbPw1 = repw;
									System.out.println(dbPw1 + "로 비밀번호 변경완료");
								}
								else if(log == dbAcc2) {
									dbPw2 = repw;
									System.out.println(dbPw2 + "로 비밀번호 변경완료");
								}							
							}
						}
						
					}				
				}
				else if(sel == 0) {
					System.out.println("종료");
					break;
				}		
		}
		
	}

}
